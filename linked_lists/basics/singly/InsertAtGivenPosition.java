package linked_lists.basics.singly;

public class InsertAtGivenPosition {
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
      System.out.print(current.data);
      if (current.next != null) {
        System.out.print(" -> ");
      }
      current = current.next;
    }
  }

  public void insertNodeAtPosition(int value, int position) {
    ListNode newNode = new ListNode(value);
    if (position == 1) {
      newNode.next = head;
      head = newNode;
    } else {
      ListNode previous = head;
      int count = 1;
      while (count < position - 1) {
        previous = previous.next;
        count++;
      }
      ListNode current = previous.next;
      previous.next = newNode;
      newNode.next = current;
    }
  }

  public static void main(String[] args) {
    InsertAtGivenPosition linkedList = new InsertAtGivenPosition();
    linkedList.head = new ListNode(10);
    ListNode second = new ListNode(1);
    ListNode third = new ListNode(8);
    ListNode fourth = new ListNode(11);

    linkedList.head.next = second;
    second.next = third;
    third.next = fourth;

    linkedList.displayLinkedList();

    linkedList.insertNodeAtPosition(7, 3);
    linkedList.insertNodeAtPosition(6, 5);
    linkedList.insertNodeAtPosition(9, 6);
    System.out.println();
    linkedList.displayLinkedList();
  }
}
