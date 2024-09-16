package leetcode.medium;

public class Solution2 {
  private ListNode head;

  private static class ListNode {
    private int val;
    private ListNode next;

    public ListNode(int data) {
      this.val = data;
      this.next = null;
    }
  }

  public void displayLinkedList() {
    ListNode current = head;
    while (current != null) {
      System.out.print(current.val);
      if (current.next != null) {
        System.out.print(" -> ");
      }
      current = current.next;
    }
  }

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(0);
    ListNode tail = dummy;
    int carry = 0;
    while (l1 != null || l2 != null) {
        int x = (l1 != null) ? l1.val : 0;
        int y = (l2 != null) ? l2.val : 0;
        int sum = carry + x + y;
        carry = sum / 10;
        tail.next = new ListNode(sum % 10);
        tail = tail.next;
        if (l1 != null) l1 = l1.next;
        if (l2 != null) l2 = l2.next;
    }
    if (carry > 0) {
        tail.next = new ListNode(carry);
    }
    return dummy.next;
}



  public static void main(String[] args) {

  }
}
