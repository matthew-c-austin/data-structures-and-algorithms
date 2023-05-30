package codechallenges;

import datastructures.trees.Node;
import java.util.*;

public class TreeIntersection<T extends Comparable<T>> {

  public List<T> treeIntersection(Node<T> rootOne, Node<T> rootTwo) {
    List<T> output = new ArrayList<>();
    Map<T, Boolean> map = new HashMap<>();
    Queue<Node<T>> queue = new LinkedList<>();

    // Check if either BT is null, and end the method early if so,
    if (rootOne == null || rootTwo == null) {
      return output;
    }

// Breadth-first traversal of first tree
    queue.add(rootOne);

    while(!queue.isEmpty()) {
      Node<T> current = queue.poll();
      map.put(current.value, true);

      if (current.left != null) {
        queue.add(current.left);
      }

      if (current.right != null) {
        queue.add(current.right);
      }
    }

//Breadth-first traversal of second tree
    queue.add(rootTwo);

    while(!queue.isEmpty()) {
      Node<T> current = queue.poll();
      if(map.containsKey(current.value)) {
        output.add(current.value);
      }

      if (current.left != null) {
        queue.add(current.left);
      }

      if (current.right != null) {
        queue.add(current.right);
      }
    }

    return output;
  }
}
