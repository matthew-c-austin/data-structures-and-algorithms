package datastructures.linkedlist;

public class LinkedList
{
  Node head = null;

  public void insertAtBeginning(int value) {
    Node newNode = new Node(value);

    if (this.head == null) {
      this.head = newNode;
      return;
    }

    newNode.next = this.head;
    this.head = newNode;
  }

  public boolean includes(int value) {
    Node current = this.head;

    while (current != null) {
      if (current.value == value) {
        return true;
      }
      current = current.next;
    }

    return false;
  }

  @Override
  public String toString()
    {
      Node current = this.head;
      String values = "";
      while (current != null) {
        values += String.format("{ %d } -> ", current.value);
        current = current.next;
      }
      values += "NULL";
        return values;
    }
}
