public class Stack<T> {
    private Node<T> head;

  //represents node in stack
    private static class Node<T> {
        T data;
        Node<T> next;
//constructor
        Node(T data) {
            this.data = data;
        }
    }
  //push new item on the stack
    public void push(T item) {
        Node<T> newNode = new Node<>(item);
        newNode.next = head;
        head = newNode;
    }

    //pop and return top item on the stack
    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        T data = head.data;
        head = head.next;
        return data;
    }
 //checks if stack is empty
    public boolean isEmpty() {
        return head == null;
    }

}

