package linked_lists.basics.singly;

public class InsertAtBeginning {
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

  public void insertNodeAtStart(int value) {
    ListNode newNode = new ListNode(value);
    newNode.next = head;
    head = newNode;
  }

  public static void main(String[] args) {
    InsertAtBeginning linkedList = new InsertAtBeginning();
    linkedList.head = new ListNode(10);
    ListNode second = new ListNode(1);
    ListNode third = new ListNode(8);
    ListNode fourth = new ListNode(11);

    linkedList.head.next = second;
    second.next = third;
    third.next = fourth;

    linkedList.displayLinkedList();

    linkedList.insertNodeAtStart(7);
    linkedList.insertNodeAtStart(9);
    linkedList.insertNodeAtStart(6);
    System.out.println();
    linkedList.displayLinkedList();
  }
}
