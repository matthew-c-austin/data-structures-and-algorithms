# Linked List Insertions

## Features

Write the following methods for the Linked List class:

- append
  - arguments: new value
  - adds a new node with the given value to the end of the list
    - insert before
    - arguments: value, new value
    - adds a new node with the given new value immediately before the first node that has the value specified
  - insert after
    - arguments: value, new value
    - adds a new node with the given new value immediately after the first node that has the value specified

## Whiteboard Process

No whiteboard was created for this class implementation.

## Approach & Efficiency

- append
  - Time: O(n) - Note: this is assuming the implementation doesn't use a `tail` property for the `LinkedList` class, which would be an O(1) solution
  - Space: O(1)
- insert before
  - Time: O(n)
  - Space: O(1)
- insert after
  - Time: O(n)
  - Space: O(1)
- delete node
  - Time: O(n)
  - Space: O(1)

## Solution

[Link to LinkedList Class](lib/src/main/java/datastructures/linkedlist/LinkedList.java)

[Link to LinkedList Tests](lib/src/test/java/datastructures/linkedlist/LinkedListTest.java)
