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
}
