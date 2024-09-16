package stacks;

import java.util.EmptyStackException;

public class StackOperations {
  private ListNode top;
  private int length;

  private class ListNode {
    private int data;
    private ListNode next;

    public ListNode(int data) {
      this.data = data;
    }
  }

  public StackOperations() {
    top = null;
    length = 0;
  }

  public int getLength() {
    return length;
  }

  public boolean isEmpty() {
    return length == 0;
  }

  public void push(int data) {
    ListNode temp = new ListNode(data);
    temp.next = top;
    top = temp;
    length++;
  }

  public int pop() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    int result = top.data;
    top = top.next;
    length--;
    return result;
  }

  public int peek() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    return top.data;
  }

  public static void main(String[] args) {
    StackOperations stack = new StackOperations();
    stack.push(5);
    stack.push(7);
    stack.push(14);
    stack.push(10);
    stack.push(3);

    System.out.println(stack.peek());
    int poppedInt = stack.pop();
    System.out.println("Removed number: " + poppedInt);
    System.out.println(stack.peek());
  }
}
