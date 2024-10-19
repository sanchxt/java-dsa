package leetcode.easy;

public class Solution70 {
  public int climbStairs(int n) {
    int prev = 1, prev2 = 1;
    for (int i = 2; i <= n; i++) {
      int temp = prev + prev2;
      prev2 = prev;
      prev = temp;
    }
    return prev;
  }
}
