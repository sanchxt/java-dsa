package linked_lists.basics.singly;

public class DeleteLastNode {
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

  public ListNode deleteLastNode() {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode current = head;
    ListNode previous = null;
    while (current.next != null) {
      previous = current;
      current = current.next;
    }
    previous.next = null;
    return current;
  }

  public static void main(String[] args) {
    DeleteLastNode linkedList = new DeleteLastNode();
    linkedList.head = new ListNode(10);
    ListNode second = new ListNode(1);
    ListNode third = new ListNode(8);
    ListNode fourth = new ListNode(11);

    linkedList.head.next = second;
    second.next = third;
    third.next = fourth;

    linkedList.displayLinkedList();

    System.out.println("\nremoving the last node: " + linkedList.deleteLastNode().data);
    System.out.println();
    linkedList.displayLinkedList();
  }
}
