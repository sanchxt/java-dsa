package linked_lists.basics.singly;

public class RemoveDuplicatesFromSorted {
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

  public void removeDuplicatesFromSortedList() {
    if (head == null || head.next == null) return;

    ListNode current = head;
    while (current != null && current.next != null) {
      if (current.data == current.next.data) {
        current.next = current.next.next;
      } else {
        current = current.next;
      }
    }
  }

  public static void main(String[] args) {
    RemoveDuplicatesFromSorted linkedList = new RemoveDuplicatesFromSorted();
    linkedList.head = new ListNode(10);
    ListNode second = new ListNode(1);
    ListNode third = new ListNode(8);
    ListNode fourth = new ListNode(8);
    ListNode fifth = new ListNode(11);
    ListNode sixth = new ListNode(11);
    ListNode seventh = new ListNode(11);

    linkedList.head.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;
    fifth.next = sixth;
    sixth.next = seventh;

    linkedList.displayLinkedList();
    linkedList.removeDuplicatesFromSortedList();
    System.out.println();
    linkedList.displayLinkedList();
  }
}
