package leetcode.easy;

import java.util.HashMap;

public class Solution1 {
  public int[] twoSum(int[] nums, int target) {
    int ans[] = new int[2];
    HashMap<Integer, Integer> mpp = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (mpp.containsKey(complement))
          return new int[] { mpp.get(complement), i };
      mpp.put(nums[i], i);
    }
    return ans;
  }
}
