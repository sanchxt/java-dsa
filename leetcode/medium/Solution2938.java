package leetcode.medium;

public class Solution2938 {
  // tc: O(N) , sc: O(1)
  public long minimumSteps(String s) {
    int whitePos = 0;
    long totalSwaps = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '0') {
        totalSwaps += i - whitePos;
        whitePos++;
      }
    }
    return totalSwaps;
  }

  // OR
  // tc: O(N) , sc: O(1)
  public long minimumSteps2(String s) {
    long totalSwaps = 0;
    int blackBalls = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '0') totalSwaps += (long) blackBalls;
      else blackBalls++;
    }
    return totalSwaps;
  }
}
