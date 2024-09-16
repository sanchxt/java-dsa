package queues;

import java.util.NoSuchElementException;

public class QueueOperations {
  private ListNode front;
  private ListNode rear;
  private int length;

  private class ListNode {
    private int data;
    private ListNode next;

    public ListNode(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public int getLength() {
    return length;
  }

  public boolean isEmpty() {
    return length == 0;
  }

  public QueueOperations() {
    this.front = null;
    this.rear = null;
    this.length = 0;
  }

  public void displayQueue() {
    if (isEmpty()) {
      return;
    }
    ListNode curr = front;
    while (curr != null) {
      System.out.print(curr.data + " -> ");
      curr = curr.next;
    }
    System.out.println("null");
  }

  public void enqueue(int data) {
    ListNode temp = new ListNode(data);
    if (isEmpty()) {
      front = temp;
    } else {
      rear.next = temp;
    }
    rear = temp;
    length++;
  }

  public int dequeue() {
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    int result = front.data;
    front = front.next;
    if (front == null) {
      rear = null;
    }
    length--;
    return result;
  }

  public static void main(String[] args) {
    QueueOperations queue = new QueueOperations();
    queue.enqueue(7);
    queue.enqueue(4);
    queue.enqueue(9);
    queue.displayQueue();
    queue.dequeue();
    queue.displayQueue();
  }
}
