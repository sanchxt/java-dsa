package leetcode.easy;

public class Solution1752 {
  public boolean check(int[] nums) {
    int drop = 0;
    for (int i = 1; i < nums.length; i++) {
        if (nums[i - 1] > nums[i]) drop++;
    }
    if (nums[0] < nums[nums.length - 1]) drop++;
    return drop <= 1;
  }
}
