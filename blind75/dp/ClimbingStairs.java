package blind75.dp;

public class ClimbingStairs {
  // tc: O(N) , sc: O(N)
  static int climbStairsBrute(int n) {
    int dp[] = new int[n + 1];
    dp[0] = dp[1] = 1;
    for (int i = 2; i <= n; i++) {
      dp[i] = dp[i - 1] + dp[i - 2];
    }
    return dp[n];
  }

  // tc: O(N) , sc: O(1)
  static int climbStairsOptimal(int n) {
    int prev = 1, prev2 = 1;
    for (int i = 2; i <= n; i++) {
      int curr = prev + prev2;
      prev2 = prev;
      prev = curr;
    }
    return prev;
  }

  public static void main(String[] args) {
    int total = climbStairsOptimal(7);
    System.out.println("total ways: " + total);
  }
}
