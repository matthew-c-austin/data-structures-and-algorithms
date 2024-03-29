# Binary Tree and BST Implementation

## Features

### Node

- Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.

### Binary Tree

- Create a Binary Tree class
  - Define a method for each of the depth first traversals:
    - pre order
    - in order
    - post order
  - Each depth first traversal method should return an array of values, ordered appropriately.

### Binary Search Tree

- Create a Binary Search Tree class
  - This class should be a sub-class (or your languages equivalent) of the Binary Tree Class, with the following additional methods:
  - Add
    - Arguments: value
    - Return: nothing
    - Adds a new node with that value in the correct location in the binary search tree.
  - Contains
    - Argument: value
    - Returns: boolean indicating whether or not the value is in the tree at least once.

## Whiteboard Process

No whiteboard was created for this class implementation.

## Approach & Efficiency

- The Big O time complexity for the traversals is O(n), as every node is visited exactly once. The space complexity is O(h), where h is the height of the tree.

### BST

- Add (Insertion):
  - Average case: O(log n)
  - Worst case: O(n)

- Contains (Search):
  - Average case: O(log n)
  - Worst case: O(n)

## Solution

### Node Solution

[Link to Tree Node Class](lib/src/main/java/datastructures/trees/Node.java)

### Binary Tree Solution

[Link to Binary Tree Class](lib/src/main/java/datastructures/trees/BinaryTree.java)

[Link to Binary Tree Test](lib/src/test/java/datastructures/trees/BinaryTreeTest.java)

### BST Solution

[Link to BST Class](lib/src/main/java/datastructures/trees/BinarySearchTree.java)

[Link to BST Test](lib/src/test/java/datastructures/trees/BinarySearchTreeTest.java)

