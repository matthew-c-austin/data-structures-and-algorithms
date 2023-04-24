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

  @Test void testAppendOneNode()
  {
    LinkedList sut = new LinkedList();
    sut.append(4);
    assertEquals(4, sut.head.value);
  }

  @Test void testAppendMultipleNode()
  {
    LinkedList sut = new LinkedList();
    sut.insertAtBeginning(1);
    sut.insertAtBeginning(2);
    sut.insertAtBeginning(3);
    sut.append(4);
    assertEquals(4, sut.head.next.next.next.value);
  }

  @Test void testLinkedListInsertBeforeInMiddle()
  {
    LinkedList sut = new LinkedList();
    sut.insertAtBeginning(1);
    sut.insertAtBeginning(2);
    sut.insertAtBeginning(3);
    sut.insertBefore(1, 4);
    assertEquals(sut.head.next.next.value, 4);
  }

  @Test void testLinkedListInsertBeforeAtHead()
  {
    LinkedList sut = new LinkedList();
    sut.insertAtBeginning(1);
    sut.insertBefore(1, 4);
    assertEquals(sut.head.value, 4);
  }

  @Test void testLinkedListInsertBeforeFails()
  {
    LinkedList sut = new LinkedList();
    sut.insertAtBeginning(1);
    sut.insertAtBeginning(2);
    sut.insertAtBeginning(3);
    boolean result = sut.insertBefore(5, 4);
    assertFalse(result);
  }

  @Test void testLinkedListAfterInMiddle()
  {
    LinkedList sut = new LinkedList();
    sut.insertAtBeginning(1);
    sut.insertAtBeginning(2);
    sut.insertAtBeginning(3);
    sut.insertAfter(2, 3);
    assertEquals(sut.head.next.next.value, 3);
  }

  @Test void testLinkedListAfterLast()
  {
    LinkedList sut = new LinkedList();
    sut.insertAtBeginning(1);
    sut.insertAtBeginning(2);
    sut.insertAtBeginning(3);
    sut.insertAfter(1, 4);
    assertEquals(sut.head.next.next.next.value, 4);
    assertNull(sut.head.next.next.next.next);
  }

  @Test void testLinkedListInsertAfterFails()
  {
    LinkedList sut = new LinkedList();
    sut.insertAtBeginning(1);
    sut.insertAtBeginning(2);
    sut.insertAtBeginning(3);
    boolean result = sut.insertAfter(5, 4);
    assertFalse(result);
  }
}
