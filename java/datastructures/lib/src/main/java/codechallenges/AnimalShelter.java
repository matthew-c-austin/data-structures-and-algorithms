package codechallenges;

import datastructures.queue.Node;
import datastructures.queue.Queue;

public class AnimalShelter {

  // Enum
  public enum Species {
    DOG,
    CAT,
    NONE
  }

  // Constructor
  public AnimalShelter() {
    queue = new Queue<Animal>();
  }

  // Fields
  private Queue<Animal> queue;

  // Animal Class
  public class Animal {
    private Species species;
    private String name;

    public Animal(Species species, String name) {
      this.species = species;
      this.name = name;
    }

    public Species getSpecies() {
      return species;
    }

    public void setSpecies(Species species) {
      this.species = species;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }
  }

  // Methods
  public void enqueue(Animal animal) {
    queue.enqueue(animal);
  }

  // Queue data structure handles empty queue error throwing
  public String dequeue(Species pref) {
    // For no preference of species, i.e., NONE, dequeue the next animal
    if (pref == Species.NONE) {
      // This will return null implicitly if there is an empty queue
      return queue.dequeue().getName();
    }

    Queue<Animal> tempQueue = new Queue<>();
    boolean isDequeued = false;
    String name = "";

    // Traverse the queue and transfer to tempQueue until we reach the preferred species
    while (!queue.isEmpty()) {
      Animal current = queue.peek();
      if (current.getSpecies() == pref && tempQueue.isEmpty()) {
        name = queue.dequeue().getName();
        return name;
      } else if (current.getSpecies() == pref && !isDequeued) {
        name = queue.dequeue().getName();
        isDequeued = true;
      } else {
        tempQueue.enqueue(queue.dequeue());
      }
    }
    queue = tempQueue;

    if (isDequeued) {
      return name;
    } else {
      return null;
    }
  }
}
