package linked_lists.basics.singly;

public class FindNthNodeFromEnd {
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

  public ListNode findNthNodeFromEnd(int n) {
    if (head == null || head.next == null) return head;

    ListNode mainPtr = head;
    ListNode referencePtr = head;
    int count = 0;
    while (count < n) {
      referencePtr = referencePtr.next;
      count++;
    }

    while (referencePtr != null) {
      referencePtr = referencePtr.next;
      mainPtr = mainPtr.next;
    }
    return mainPtr;
  }

  public static void main(String[] args) {
    FindNthNodeFromEnd linkedList = new FindNthNodeFromEnd();
    linkedList.head = new ListNode(10);
    ListNode second = new ListNode(1);
    ListNode third = new ListNode(8);
    ListNode fourth = new ListNode(11);

    linkedList.head.next = second;
    second.next = third;
    third.next = fourth;

    linkedList.displayLinkedList();
    System.out.println("\n2nd node from the end is: " + linkedList.findNthNodeFromEnd(2).data);
  }
}
