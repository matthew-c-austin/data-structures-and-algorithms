package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest
{
  @Test void testLinkedListInstantiation()
    {
      LinkedList sut = new LinkedList();
      assertNull(sut.head);
    }

  @Test void testLinkedListInsertion()
  {
    LinkedList sut = new LinkedList();
    sut.insertAtBeginning(1);
    int expected = 1;
    int actual = sut.head.value;
    assertEquals(expected, actual);
  }

  @Test void testLinkedListHead()
  {
    LinkedList sut = new LinkedList();
    sut.insertAtBeginning(1);
    sut.insertAtBeginning(2);
    sut.insertAtBeginning(3);
    int expected = 3;
    int actual = sut.head.value;
    assertEquals(expected, actual);
  }

  @Test void testLinkedListInsertMultipleNodes()
  {
    LinkedList sut = new LinkedList();
    sut.insertAtBeginning(1);
    sut.insertAtBeginning(2);
    sut.insertAtBeginning(3);
    int expected = 1;
    int actual = sut.head.next.next.value;
    assertEquals(expected, actual);
  }

  @Test void testLinkedListIncludesReturnsTrue()
  {
    LinkedList sut = new LinkedList();
    sut.insertAtBeginning(1);
    sut.insertAtBeginning(2);
    sut.insertAtBeginning(3);
    assertTrue(sut.includes(1));
  }

  @Test void testLinkedListIncludesReturnsFalse()
  {
    LinkedList sut = new LinkedList();
    sut.insertAtBeginning(1);
    sut.insertAtBeginning(2);
    sut.insertAtBeginning(3);
    assertFalse(sut.includes(4));
  }

  @Test void testLinkedListToString()
  {
    LinkedList sut = new LinkedList();
    sut.insertAtBeginning(1);
    sut.insertAtBeginning(2);
    sut.insertAtBeginning(3);
    String expected = "{ 3 } -> { 2 } -> { 1 } -> NULL";
    String actual = sut.toString();
    assertEquals(expected, actual);
  }
}
