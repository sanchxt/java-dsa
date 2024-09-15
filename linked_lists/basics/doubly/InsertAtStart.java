package linked_lists.basics.doubly;

public class InsertAtStart {
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

  public InsertAtStart() {
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

  public void insertAtBeginning(int value) {
    ListNode newNode = new ListNode(value);
    if (isEmpty()) {
      tail = newNode;
    } else {
      head.prev = newNode;
    }
    newNode.next = head;
    head = newNode;
    length++;
  }

  public static void main(String[] args) {
    InsertAtStart dll = new InsertAtStart();
    dll.insertAtBeginning(5);
    dll.insertAtBeginning(8);
    dll.insertAtBeginning(3);
    dll.insertAtBeginning(12);

    dll.displayForward();
    System.out.println();
    dll.displayBackwards();
  }
}
