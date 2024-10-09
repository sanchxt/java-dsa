package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Solution349 {
  public int[] intersection(int[] nums1, int[] nums2) {
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    int i = 0, j = 0;
    List<Integer> result = new ArrayList<>();
    while (i < nums1.length && j < nums2.length) {
      if (nums1[i] < nums2[j]) i++;
      else if (nums1[i] > nums2[j]) j++;
      else {
        result.add(nums1[i]);
        while(i < nums1.length - 1 && nums1[i] == nums1[i + 1]) {
          i++;
        }
        while(j < nums2.length - 1 && nums2[j] == nums2[j + 1]) {
          j++;
        }
        i++;
        j++;
      }
    }
    return result.stream().mapToInt(Integer::intValue).toArray();
  }

  // OR!!!
  public int[] intersection2(int[] nums1, int[] nums2) {
      HashSet<Integer> set = new HashSet<>();
      for (int val : nums1) set.add(val);
      HashSet<Integer> result = new HashSet<>();
      for (int val : nums2) {
        if (set.contains(val)) result.add(val);
      }
      int[] finalArr = new int[result.size()];
      int idx = 0;
      for (int val : result) finalArr[idx++] = val;
      return finalArr;
  }
}
