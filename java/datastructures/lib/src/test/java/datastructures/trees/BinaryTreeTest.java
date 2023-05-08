package datastructures.trees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {
  BinaryTree<Integer> sut;

  @BeforeEach
  void setUp() {
    sut = new BinaryTree<>(4);
    sut.root.left = new Node<>(2);
    sut.root.right = new Node<>(6);
  }

  @Test
  void testInstantiateTreeWithSingleNode() {
    assertEquals(4, sut.getRoot().value);
  }

  @Test
  void testPreOrderTraversal() {
    List<Integer> preOrder = sut.preOrderTraversal();
    assertEquals(Arrays.asList(4, 2, 6), preOrder);
  }

  @Test
  void testInOrderTraversal() {
    List<Integer> inOrder = sut.inOrderTraversal();
    assertEquals(Arrays.asList(2, 4, 6), inOrder);
  }

  @Test
  void testPostOrderTraversal() {
    List<Integer> postOrder = sut.postOrderTraversal();
    assertEquals(Arrays.asList(2, 6, 4), postOrder);
  }

  @Test
  void testGetMax() {
    BinarySearchTree<Integer> tree = new BinarySearchTree<>(2);

    // Adding elements to the tree based on the given pre-order traversal
    // [2, 7, 2, 6, 5, 11, 5, 9, 4]
    tree.add(7);
    tree.add(2);
    tree.add(6);
    tree.add(5);
    tree.add(11);
    tree.add(5);
    tree.add(9);
    tree.add(4);

    int expectedMax = 11;
    assertEquals(expectedMax, tree.getMax());
  }
}
