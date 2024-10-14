package leetcode.easy;

import java.util.HashSet;

public class Solution217 {
  public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for (int i : nums)
      if (set.add(i) == false) return true;
    return false;
  }
}
