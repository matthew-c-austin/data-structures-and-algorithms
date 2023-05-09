package datastructures.trees;

public class BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T> {

  public BinarySearchTree(T value) {
    super(value);
  }

  public void add(T value) {
    this.root = add(this.root, value);
  }

  protected Node<T> add(Node<T> node, T value) {
    if (node == null) {
      return new Node<>(value);
    }

    /* We use the compareTo method while extending the T generic with the Comparable interface, which gives us the ability to compare a general class with its compareTo method. Java has this method for all primitive wrapper classes.

    It takes an object of the same type T as an argument and returns an integer with the following meaning:

    - A negative integer if the current object is less than the argument object
    - Zero if the current object is equal to the argument object
    - A positive integer if the current object is greater than the argument object
    */
    int cmp = value.compareTo(node.value);
    if (cmp < 0) {
      node.left = add(node.left, value);
    } else if (cmp > 0) {
      node.right = add(node.right, value);
    } else {
      // Value already exists in the tree; ignore the new value.
    }

    return node;
  }

  public boolean contains(T value) {
    return contains(this.root, value);
  }

  private boolean contains(Node<T> node, T value) {
    if (node == null) {
      return false;
    }

    int cmp = value.compareTo(node.value);
    if (cmp < 0) {
      return contains(node.left, value);
    } else if (cmp > 0) {
      return contains(node.right, value);
    } else {
      return true;
    }
  }
}
