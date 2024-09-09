package linked_lists.basics.singly;

public class RemoveANode {
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

  public void removeANode(int value) {
    ListNode current = head;
    ListNode temp = null;
    while (current != null && current.data != value) {
      temp = current;
      current = current.next;
    }
    if (current == null) return;
    temp.next = current.next;
  }

  public static void main(String[] args) {
    RemoveANode linkedList = new RemoveANode();
    linkedList.head = new ListNode(10);
    ListNode second = new ListNode(1);
    ListNode third = new ListNode(8);
    ListNode fourth = new ListNode(11);

    linkedList.head.next = second;
    second.next = third;
    third.next = fourth;

    linkedList.displayLinkedList();

    System.out.println();
    linkedList.removeANode(8);
    linkedList.displayLinkedList();
  }
}
