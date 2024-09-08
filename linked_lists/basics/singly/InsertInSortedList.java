package linked_lists.basics.singly;

public class InsertInSortedList {
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

  public void insertInSortedList(int value) {
    if (head == null) return;

    ListNode current = head;
    ListNode temp = null;
    ListNode newNode = new ListNode(value);
    while (current != null && current.data < newNode.data) {
      temp = current;
      current = current.next;
    }
    newNode.next = current;
    temp.next = newNode;
  }

  public static void main(String[] args) {
    InsertInSortedList linkedList = new InsertInSortedList();
    linkedList.head = new ListNode(1);
    ListNode second = new ListNode(8);
    ListNode third = new ListNode(10);
    ListNode fourth = new ListNode(11);

    linkedList.head.next = second;
    second.next = third;
    third.next = fourth;

    linkedList.displayLinkedList();

    linkedList.insertInSortedList(5);
    System.out.println();
    linkedList.displayLinkedList();
  }
}
