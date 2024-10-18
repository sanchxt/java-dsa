package leetcode.easy;

public class Solution338 {
  // tc: O(N) , sc: O(1)
  public int[] countBits(int n) {
    int result[] = new int[n + 1];
    if (n == 0) return result;
    result[0] = 0;
    if (n >= 1) result[1] = 1;

    // number of 1s in arr[i] will be equal to number of 1s in arr[i / 2] in even cases
    // in odd cases, it'll be the same but with an addition of 1
    // for e.g., no. of 1s in 4 = 2, in 2 = 2
    // and, number of 1s in 15 = 4, in 7 = 2 + 1 = 3
    for (int i = 2; i <= n; i++) {
      if (i % 2 == 0) result[i] = result[i / 2];
      else result[i] = result[i / 2] + 1;
    }
    return result;
  }
}
