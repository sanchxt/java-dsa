package linked_lists.basics.singly;

public class RemoveLoop {
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

  public void createLoopLinkedList() {
    ListNode first = new ListNode(1);
    ListNode second = new ListNode(2);
    ListNode third = new ListNode(3);
    ListNode fourth = new ListNode(4);
    ListNode fifth = new ListNode(5);
    ListNode sixth = new ListNode(6);

    head = first;
    first.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;
    fifth.next = sixth;
    sixth.next = third;
  }

  public void removeLoop(ListNode slowPtr) {
    ListNode temp = head;
    while (slowPtr.next != temp.next) {
      temp = temp.next;
      slowPtr = slowPtr.next;
    }
    slowPtr.next = null;
  }

  public void containsLoop() {
    ListNode fastPtr = head;
    ListNode slowPtr = head;

    while (fastPtr != null && fastPtr.next != null) {
      fastPtr = fastPtr.next.next;
      slowPtr = slowPtr.next;
      if (slowPtr == fastPtr) {
        removeLoop(slowPtr);
        return;
      }
    }
  }

  public static void main(String[] args) {
    RemoveLoop linkedList = new RemoveLoop();
    linkedList.createLoopLinkedList();

    linkedList.containsLoop();
    System.out.println("removed the loop from the linked list");
  }
}
