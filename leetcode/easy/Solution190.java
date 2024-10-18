package leetcode.easy;

public class Solution190 {
  public static int reverseBits(int n) {
    int result = 0;
    for (int i = 0; i < 32; i++) {
      result = (result << 1) | (n & 1);
      n = n >>> 1;
    }
    return result;
  }
}
