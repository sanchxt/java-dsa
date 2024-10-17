package leetcode.medium;

public class Solution371 {
  public int getSum(int a, int b) {
    int c;
    while (b != 0) {
      c = a & b;
      a = a ^ b;
      b = c << 1;
    }
    return a;
  }
}
