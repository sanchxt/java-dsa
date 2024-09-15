package linked_lists.basics.singly;

public class MergeSortedLists {
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

  public static ListNode mergeLists(ListNode a, ListNode b) {
    ListNode dummy = new ListNode(0);
    ListNode tail = dummy;

    while (a != null && b != null) {
      if (a.data <= b.data) {
        tail.next = a;
        a = a.next;
      } else {
        tail.next = b;
        b = b.next;
      }
      tail = tail.next;
    }

    if (a == null) {
      tail.next = b;
    } else {
      tail.next = a;
    }
    return dummy.next;
  }

  public static void main(String[] args) {
    MergeSortedLists linkedListOne = new MergeSortedLists();
    MergeSortedLists linkedListTwo = new MergeSortedLists();

    linkedListOne.head = new ListNode(4);
    ListNode second = new ListNode(5);
    ListNode third = new ListNode(11);
    ListNode fourth = new ListNode(14);
    ListNode fifth = new ListNode(20);
    linkedListOne.head.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;

    linkedListTwo.head = new ListNode(2);
    ListNode other_second = new ListNode(6);
    ListNode other_third = new ListNode(17);
    linkedListTwo.head.next = other_second;
    other_second.next = other_third;

    System.out.println("First list:");
    linkedListOne.displayLinkedList();

    System.out.println("\nSecond list:");
    linkedListTwo.displayLinkedList();

    MergeSortedLists result = new MergeSortedLists();
    result.head = mergeLists(linkedListOne.head, linkedListTwo.head);
    System.out.println("\n\nAfter merging:");
    result.displayLinkedList();
  }
}
