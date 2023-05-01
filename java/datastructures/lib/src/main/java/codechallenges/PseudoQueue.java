package codechallenges;

import datastructures.stack.Stack;

public class PseudoQueue<T> {
  private Stack<T> enqueueStack;
  private Stack<T> dequeueStack;

  public PseudoQueue() {
    enqueueStack = new Stack<>();
    dequeueStack = new Stack<>();
  }

  public void enqueue(T value) {
    // If the enqueue stack is empty, then we transfer the dequeue stack to the enqueue stack, then enqueue the value
    if (enqueueStack.isEmpty()) {
      while (!dequeueStack.isEmpty()) {
        enqueueStack.push(dequeueStack.pop());
      }
    }

    enqueueStack.push(value);
  }

  public T dequeue() {
    // If the dequeue stack is empty, then we transfer the enqueue stack to the dequeue stack, then dequeue the value
    if (dequeueStack.isEmpty()) {
      while (!enqueueStack.isEmpty()) {
        dequeueStack.push(enqueueStack.pop());
      }
    }

    if (!dequeueStack.isEmpty()) {
      return dequeueStack.pop();
    } else {
      throw new RuntimeException("PseudoQueue is empty");
    }
  }
}
