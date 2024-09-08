package linked_lists.basics.singly;

public class SearchAnElement {
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

  public ListNode searchElement(int searchValue) {
    ListNode current = head;
    while (current != null) {
      if (current.data == searchValue) {
        return current;
      }
      current = current.next;
    }
    return null;
  }

  public static void main(String[] args) {
    SearchAnElement linkedList = new SearchAnElement();
    linkedList.head = new ListNode(10);
    ListNode second = new ListNode(1);
    ListNode third = new ListNode(8);
    ListNode fourth = new ListNode(11);

    linkedList.head.next = second;
    second.next = third;
    third.next = fourth;

    linkedList.displayLinkedList();

    ListNode searchNumber = linkedList.searchElement(9);
    if (searchNumber == null) {
      System.out.println("\n8 doesn't exist");
    } else {
      System.out.println("\n8 exists");
    }
    linkedList.displayLinkedList();
  }
}
