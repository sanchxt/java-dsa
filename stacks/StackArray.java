package stacks;

public class StackArray {
  private int top;
  private int[] arr;

  public StackArray(int capacity) {
    top = -1;
    arr = new int[capacity];
  }

  public StackArray() {
    this(10);
  }

  public boolean isFull() {
    return arr.length == top + 1;
  }

  public boolean isEmpty() {
    return top == -1;
  }

  public void push(int value) {
    if (isFull()) {
      throw new RuntimeException("stack is full");
    }
    top++;
    arr[top] = value;
  }

  public int pop() {
    if (isEmpty()) {
      throw new RuntimeException("stack is empty");
    }
    int result = arr[top--];
    return result;
  }

  public int peek() {
    if (isEmpty()) {
      throw new RuntimeException("stack is empty");
    }
    return arr[top];
  }

  public static void main(String[] args) {
    StackArray stack = new StackArray(4);
    stack.push(4);
    stack.push(8);
    stack.push(3);
    System.out.println(stack.pop());
  }
}
