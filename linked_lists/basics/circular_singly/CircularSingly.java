package linked_lists.basics.circular_singly;

import java.util.NoSuchElementException;

public class CircularSingly {
  private ListNode last;
  private int length;

  private class ListNode {
    private ListNode next;
    private int data;

    public ListNode(int data) {
      this.data = data;
    }
  }

  public CircularSingly() {
    this.last = null;
    this.length = 0;
  }

  public int getLength() {
    return length;
  }

  public boolean isEmpty() {
    return length == 0;
  }

  public void createCircularList() {
    ListNode first = new ListNode(2);
    ListNode second = new ListNode(7);
    ListNode third = new ListNode(17);
    ListNode fourth = new ListNode(29);

    first.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = first;
    last = fourth;
  }

  public void displayCircularList() {
    if (last == null) {
      return;
    }
    ListNode first = last.next;
    while (first != last) {
      System.out.print(first.data + " -> ");
      first = first.next;
    }
    System.out.print(first.data);
  }

  public void insertAtStart(int value) {
    ListNode temp = new ListNode(value);
    if (last == null) {
      last = temp;
    } else {
      temp.next = last.next;
    }
    last.next = temp;
    length++;
  }

  public void insertAtLast(int value) {
    ListNode temp = new ListNode(value);
    if (last == null) {
      last = temp;
      last.next = last;
    } else {
      temp.next = last.next;
      last.next = temp;
      last = temp;
    }
    length++;
  }

  public ListNode removeAtStart() {
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    ListNode temp = last.next;
    if (last.next == last) {
      last = null;
    } else {
      last.next = temp.next;
    }
    temp.next = null;
    length--;
    return temp;
  }

  public void removeAtEnd() {
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    ListNode head = last.next;
    ListNode temp = last.next;
    if (temp == last) {
      last = null;
    } else {
      while (temp.next != last) {
        temp = temp.next;
      }
      temp.next = head;
      last = temp;
    }
    length--;
  }

  public static void main(String[] args) {
    CircularSingly csll = new CircularSingly();
    csll.createCircularList();
    csll.displayCircularList();

    csll.insertAtStart(8);
    csll.insertAtStart(9);
    csll.insertAtLast(47);
    csll.insertAtLast(35);
    System.out.println("\n");
    csll.displayCircularList();

    csll.removeAtStart();
    csll.removeAtStart();
    System.out.println("\n");
    csll.displayCircularList();

    csll.removeAtEnd();
    System.out.println("\nAfter removing the last node, new list is:");
    csll.displayCircularList();
  }
}
