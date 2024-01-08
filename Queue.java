public class Queue<T> {
  private Node<T> head;
  private Node<T> tail;

  // data stored in node and next node
  private static class Node<T> {
    T data;
    Node<T> next;

    // constructor
    Node(T data) {
      this.data = data;
      this.next = null;
    }
  }

  // check if queue is empty
  public boolean isEmpty() {
    return head == null;
  }

  // add item to the back of the queue
  public void enqueue(T item) {
    Node<T> newNode = new Node<>(item);
    if (isEmpty()) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      tail = newNode;
    }
  }

  // remove and return item from front of the queue
  public T dequeue() {
    if (isEmpty()) {
      System.out.println("empty queu");
    }
    T item = head.data;
    head = head.next;
    if (head == null) {
      tail = null;
    }
    return item;
  }
}
