package leetcode.medium;

import java.util.HashSet;

public class Solution128 {
  public int longestConsecutive(int[] nums) {
    if (nums.length == 0) return 0;
    int maxSequence = 1;
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < nums.length; i++) set.add(nums[i]);

    for (int num : set) {
      if (!set.contains(num - 1)) {
        int count = 1;
        int elem = num;
        while (set.contains(elem + 1)) {
          elem++;
          count++;
        }
        maxSequence = Math.max(maxSequence, count);
      }
    }
    return maxSequence;
  }
}
