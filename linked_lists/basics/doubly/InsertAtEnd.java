package linked_lists.basics.doubly;

public class InsertAtEnd {
  private ListNode head;
  private ListNode tail;
  private int length;

  private class ListNode {
    private int data;
    private ListNode next;
    private ListNode prev;

    public ListNode (int data) {
      this.data = data;
    }
  }

  public InsertAtEnd() {
    this.head = null;
    this.tail = null;
    this.length = 0;
  }

  public boolean isEmpty() {
    return length == 0;
  }

  public int getLength() {
    return length;
  }

  public void displayForward() {
    if (head == null) {
      return;
    }

    ListNode temp = head;
    while (temp != null) {
      System.out.print(temp.data);
      if (temp.next != null) {
        System.out.print(" -> ");
      }
      temp = temp.next;
    }
  }

  public void displayBackwards() {
    if (tail == null) {
      return;
    }

    ListNode temp = tail;
    while (temp != null) {
      System.out.print(temp.data);
      if (temp.prev != null) {
        System.out.print(" -> ");
      }
      temp = temp.prev;
    }
  }

  public void insertAtLast(int value) {
    ListNode newNode = new ListNode(value);
    if (isEmpty()) {
      head = newNode;
    } else {
      tail.next = newNode;
      newNode.prev = tail;
    }
    tail = newNode;
    length++;
  }

  public static void main(String[] args) {
    InsertAtEnd dll = new InsertAtEnd();
    dll.insertAtLast(5);
    dll.insertAtLast(8);
    dll.insertAtLast(3);
    dll.insertAtLast(12);

    dll.displayForward();
    System.out.println();
    dll.displayBackwards();
  }
}
