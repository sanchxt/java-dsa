package linked_lists.basics.singly;

public class DetectALoop {
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

  public boolean containsLoop() {
    ListNode fastPtr = head;
    ListNode slowPtr = head;
    while (fastPtr != null && fastPtr.next != null) {
      fastPtr = fastPtr.next.next;
      slowPtr = slowPtr.next;
      if (slowPtr == fastPtr) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    DetectALoop linkedList = new DetectALoop();
    linkedList.createLoopLinkedList();

    if (linkedList.containsLoop()) {
      System.out.println("the linked list contains a loop");
    } else {
      System.out.println("the linked list doesn't contain a loop");
    }
  }
}
