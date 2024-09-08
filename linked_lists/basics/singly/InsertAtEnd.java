package linked_lists.basics.singly;

public class InsertAtEnd {
  private ListNode head;

  private static class ListNode {
    private int data;
    private ListNode next;

    public ListNode(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public void displayLinkedList() {
    ListNode current = head;
    while (current != null) {
      System.out.print(current.data + " --> ");
      current = current.next;
    }
  }

  public void insertNodeAtEnd(int value) {
    ListNode newNode = new ListNode(value);
    if (head == null) {
      head = newNode;
      return;
    }

    ListNode current = head;
    while (current.next != null) {
      current = current.next;
    }
    current.next = newNode;
  }

  public static void main(String[] args) {
    InsertAtEnd linkedList = new InsertAtEnd();
    linkedList.head = new ListNode(10);
    ListNode second = new ListNode(1);
    ListNode third = new ListNode(8);
    ListNode fourth = new ListNode(11);

    linkedList.head.next = second;
    second.next = third;
    third.next = fourth;

    linkedList.displayLinkedList();

    linkedList.insertNodeAtEnd(7);
    linkedList.insertNodeAtEnd(6);
    linkedList.insertNodeAtEnd(9);
    System.out.println();
    linkedList.displayLinkedList();
  }
}
