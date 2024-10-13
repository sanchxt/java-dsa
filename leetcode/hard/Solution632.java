package leetcode.hard;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Solution632 {
  public int[] smallestRange(List<List<Integer>> nums) {
    List<int[]> merged = new ArrayList<>();
    for (int i = 0; i < nums.size(); i++) {
      for (int num : nums.get(i))
      merged.add  (new int[] { num, i });
    }
    merged.sort(Comparator.comparingInt(a -> a[0]));

    HashMap<Integer, Integer> freq = new HashMap<>();
    int left = 0, count = 0;
    int start = 0, end = Integer.MAX_VALUE;

    for (int i = 0; i < merged.size(); i++) {
      freq.put(merged.get(i)[1], freq.getOrDefault(merged.get(i)[1], 0) + 1);
      if (freq.get(merged.get(i)[1]) == 1) count++;

      while (count == nums.size()) {
        int curRange = merged.get(i)[0] - merged.get(left)[0];
        if (curRange < end - start) {
          start = merged.get(left)[0];
          end = merged.get(i)[0];
        }
        freq.put(
          merged.get(left)[1],
          freq.get(merged.get(left)[1]) - 1
        );
        if (freq.get(merged.get(left)[1]) == 0) count--;
        left++;
      }
    }
    return new int[] { start, end };
  }
}
