package linked_lists.basics.singly;

public class FindLoopStart {
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

  public ListNode getStartingNode(ListNode slowPtr) {
    ListNode temp = head;
    while (slowPtr != temp) {
      temp = temp.next;
      slowPtr = slowPtr.next;
    }
    return temp;
  }

  public ListNode containsLoop() {
    ListNode fastPtr = head;
    ListNode slowPtr = head;

    while (fastPtr != null && fastPtr.next != null) {
      fastPtr = fastPtr.next.next;
      slowPtr = slowPtr.next;
      if (slowPtr == fastPtr) {
        return getStartingNode(slowPtr);
      }
    }
    return null;
  }

  public static void main(String[] args) {
    FindLoopStart linkedList = new FindLoopStart();
    linkedList.createLoopLinkedList();

    if (linkedList.containsLoop() != null) {
      System.out.println("Loop's starting node's data: " + linkedList.containsLoop().data);
    } else {
      System.out.println("No loop detected");
    }
  }
}
