package leetcode.medium;

import java.util.Arrays;

public class Solution238 {
  public int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int result[] = new int[n];
    Arrays.fill(result, 1);
    int product = 1;
    for (int i = 0; i < n; i++) {
      result[i] *= product;
      product *= nums[i];
    }
    product = 1;
    for (int i = n - 1; i >= 0; i--) {
      result[i] *= product;
      product *= nums[i];
    }
    return result;
  }
}
