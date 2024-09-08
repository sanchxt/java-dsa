package linked_lists.basics.singly;

public class CreateSinglyLinkedList {
  private ListNode head;

  private static class ListNode {
    private int data;
    private ListNode next;

    public ListNode(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static void main(String[] args) {
    CreateSinglyLinkedList linkedList = new CreateSinglyLinkedList();
    linkedList.head = new ListNode(10);
    ListNode second = new ListNode(1);
    ListNode third = new ListNode(8);
    ListNode fourth = new ListNode(11);

    // connecting them together
    linkedList.head.next = second;
    second.next = third;
    third.next = fourth;
  }
}
