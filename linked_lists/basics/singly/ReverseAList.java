package linked_lists.basics.singly;

public class ReverseAList {
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

  public ListNode reverseLinkedList(ListNode head) {
    if (head == null) return head;

    ListNode current = head;
    ListNode previous = null;
    ListNode next = null;

    while (current != null) {
      next = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }
    return previous;
  }

  public static void main(String[] args) {
    ReverseAList linkedList = new ReverseAList();
    linkedList.head = new ListNode(10);
    ListNode second = new ListNode(1);
    ListNode third = new ListNode(8);
    ListNode fourth = new ListNode(11);

    linkedList.head.next = second;
    second.next = third;
    third.next = fourth;

    linkedList.displayLinkedList();

    System.out.println();
    ListNode reversedList = linkedList.reverseLinkedList(linkedList.head);
    ListNode reversedListHead = reversedList;
    while (reversedListHead != null) {
      System.out.print(reversedListHead.data + " --> ");
      reversedListHead = reversedListHead.next;
    }
  }
}
