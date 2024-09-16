package stacks;

import java.util.Stack;

public class ReverseString {
  public static String reverseString(String str) {
    Stack<Character> stack = new Stack<>();
    char[] chars = str.toCharArray();

    for (char c : chars) {
      stack.push(c);
    }
    for (int i = 0; i < str.length(); i++) {
      chars[i] = stack.pop();
    }
    return new String(chars);
  }

  public static void main(String[] args) {
    String str = "testt string";
    System.out.println("before: " + str);
    System.out.println("after: " + reverseString(str));
  }
}
