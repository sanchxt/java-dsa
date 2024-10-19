package blind75.dp;

import java.util.Arrays;

public class CoinChange {
  // memoization method:
  static long waysToMakeChangeBrute(int arr[], int n, int T) {
    long dp[][] = new long[n][T + 1];
    for (long row[] : dp) Arrays.fill(row, -1);
    return makeChangeUtil(arr, n, T, dp);
  }

  // tc: O(N * T) , sc: O(N * T) + O(N)
  static long makeChangeUtil(int arr[], int idx, int T, long dp[][]) {
    if (idx == 0)
      return T % 2 == 0 ? 1 : 0;
    if (dp[idx][T] != -1) return dp[idx][T];

    long notTaken = makeChangeUtil(arr, idx - 1, T, dp);
    long taken = 0;
    if (arr[idx] <= T) taken = makeChangeUtil(arr, idx, T - arr[idx], dp);
    return dp[idx][T] = notTaken + taken;
  }

  // tabulation method
  // tc: O(N * T) , sc: O(N * T)
  static long waysToMakeChangeBetter(int arr[], int n, int T){
    long dp[][] = new long[n][T + 1];
    for (int i = 0; i <= T; i++) {
      if (i % arr[0] == 0) dp[0][i] = 1;
    }

    for (int idx = 1; idx < n; idx++) {
      for (int target = 0; target <= T; target++) {
        long notTaken = dp[idx - 1][target];
        long taken = 0;
        if (arr[idx] <= target)
          taken = dp[idx][target - arr[idx]];
        dp[idx][target] = notTaken + taken;
      }
    }
    return dp[n - 1][T];
  }

  // tc: O(N * T) , sc: O(T)
  static long waysToMakeChangeOptimal(int arr[], int n, int T) {
    long prev[] = new long[T + 1];
    for (int i = 0; i <= T; i++) {
      if (i % arr[0] == 0) prev[i] = 1;
    }

    for (int idx = 1; idx < n; idx++) {
      long curr[] = new long[T + 1];
      for (int target = 0; target <= T; target++) {
        long notTaken = prev[target];
        long taken = 0;
        if (arr[idx] <= target)
          taken = curr[target - arr[idx]];
        curr[target] = notTaken + taken;
      }
      prev = curr;
    }
    return prev[T];
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3 };
    int target = 4;
    int n = arr.length;

    System.out.println("total ways: " + waysToMakeChangeOptimal(arr, n, target));
  }
}
