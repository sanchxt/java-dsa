package leetcode.medium;

import java.util.Stack;

public class Solution962 {
  static int maxWidthRamp(int[] nums) {
    int n = nums.length;
    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < n; i++) {
      if (stack.isEmpty() || nums[stack.peek()] > nums[i]) {
        stack.push(i);
      }
    }

    int maxWidth = 0;
    for (int i = n - 1; i > 0; i--) {
      while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
        maxWidth = Math.max(maxWidth, i - stack.peek());
        stack.pop();
      }
    }
    return maxWidth;
  }
}
