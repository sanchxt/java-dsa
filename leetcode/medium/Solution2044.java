package leetcode.medium;

public class Solution2044 {
  // tc: O(2^n * n) , sc: O(1)
  public int countMaxOrSubsetsBrute(int nums[]) {
    int n = nums.length;
    int maxOr = 0, count = 0;
    for (int i = 1; i < (1 << n); i++) {
      int currentOr = 0;
      for (int j = 0; j < n; j++) {
        if ((i & (1 << j)) != 0) currentOr |= nums[j];
      }

      if (currentOr > maxOr) {
        maxOr = currentOr;
        count = 1;
      } else if (currentOr == maxOr) count++;
    }
    return count;
  }

  // tc: O(2^n) , sc: O(N)
  public int countMaxOrSubsetsOptimal(int nums[]) {
    int maxOr = 0;
    for (int num : nums) maxOr |= num;
    return countSubsets(nums, 0, 0, maxOr);
  }
  public int countSubsets(int nums[], int index, int currentOr, int maxOr) {
    if (index == nums.length)
      return currentOr == maxOr ? 1 : 0;
    int include = countSubsets(nums, index + 1, currentOr | nums[index], maxOr);
    int exclude = countSubsets(nums, index + 1, currentOr, maxOr);
    return include + exclude;
  }
}
