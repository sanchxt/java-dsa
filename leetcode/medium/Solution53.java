package leetcode.medium;

public class Solution53 {
  public int maxSubArray(int[] nums) {
    if (nums == null || nums.length == 0) return 0;

    int maxSum = Integer.MIN_VALUE;
    int currentSum = 0;
    for (int i = 0; i < nums.length; i++) {
      currentSum = Math.max(nums[i], currentSum + nums[i]);
      maxSum = Math.max(maxSum, currentSum);
    }
    return maxSum;
  }
}
