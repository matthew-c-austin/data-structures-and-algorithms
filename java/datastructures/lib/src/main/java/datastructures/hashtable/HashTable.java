package datastructures.hashtable;

import java.util.*;

public class HashTable<K, V> {
  // We're using an ArrayList that has a set size initially, but if we were to actually build a smart hash table we'd dynamically change the size when the load factor reaches a certain threshold. The reason we don't use a regular array is because we can't use generics in an array because of type erasure during compilation, so Java gets angry.
  private ArrayList<LinkedList<Node>> array;
  private static final int INITIAL_CAPACITY = 187751; // This should be a decently large prime number to avoid collisions

  public HashTable() {
    array = new ArrayList<>(Collections.nCopies(INITIAL_CAPACITY, null));
  }

  // We're making it package-private for the unit tests
  int hash(K key) {
    // The hashCode() is something that all Java objects have, which can then be put into our hashing function. We cast it to a long first before casting the overall value back to an int later, to avoid integer overflow as much as possible
    long hashValue = (long) key.hashCode();

    // hashCode() might return a negative number, so we ensure it is not negative.
    hashValue = hashValue < 0 ? hashValue * -1 : hashValue;

    // This is based on a lecture I saw from a YouTube course of Dr. Rob Edwards from San Diego State University mostly. You want to use prime numbers for better distribution, generally, of the data to reduce collisions. This is because prime numbers are only divisible by 1 and themselves, which helps avoid collisions.
    int prime = 31;

    return Math.abs((int) (prime * hashValue % array.size()));

  }

  public void set(K key, V value) {
    int index = hash(key);
    if (array.get(index) == null) {
      array.set(index, new LinkedList<>());
    }

    LinkedList<Node> items = array.get(index);

    for (Node item : items) {
      if (item.key.equals(key)) {
        item.value = value; // Replace existing value
        return;
      }
    }

    items.add(new Node(key, value)); // Add new node if key not found
  }

  public V get(K key) {
    int index = hash(key);
    if (array.get(index) == null) {
      return null;
    }

    LinkedList<Node> items = array.get(index);

    for (Node item : items) {
      if (item.key.equals(key)) {
        return item.value;
      }
    }

    return null; // Return null if key not found
  }

  public boolean has(K key) {
    return get(key) != null;
  }

  public List<K> keys() {
    List<K> keysList = new ArrayList<>();
    for (LinkedList<Node> items : array) {
      if (items != null) {
        for (Node item : items) {
          keysList.add(item.key);
        }
      }
    }
    return keysList;
  }

  private class Node {
    private K key;
    private V value;

    public Node(K key, V value) {
      this.key = key;
      this.value = value;
    }
  }
}

