public class MaxSubarraySum {
  // tc: O(N^3), sc: O(1)
  static int maxSubarraySumBruteForce(int arr[]) {
    int n = arr.length;
    int maximum = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        int sum = 0;
        for (int k = i; k <= j; k++) sum += arr[k];
        maximum = Math.max(maximum, sum);
      }
    }
    return maximum;
  }

  // tc: O(N^2), sc: O(1)
  static int maxSubarraySumBetterApproach(int arr[]) {
    int n = arr.length;
    int maximum = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      int sum = 0;
      for (int j = i; j < n; j++) {
        sum += arr[j];
        maximum = Math.max(maximum, sum);
      }
    }
    return maximum;
  }

  // KADANE'S ALGO
  // tc: O(N) , sc: O(1)
  static int maxSubarraySumOptimal(int arr[]) {
    if (arr.length == 0) return 0;
    int maximum = Integer.MIN_VALUE;
    int sum = 0;

    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      if (sum > maximum) maximum = sum;
      if (sum < 0) sum = 0;
    }
    return maximum;
  }

  static int optimalAlternative(int arr[]) {
    if (arr == null || arr.length == 0) return 0;

    int maxSum = Integer.MIN_VALUE;
    int currentSum = 0;
    for (int i = 0; i < arr.length; i++) {
      currentSum = Math.max(arr[i], currentSum + arr[i]);
      maxSum = Math.max(maxSum, currentSum);
    }
    return maxSum;
  }

  public static void main(String[] args) {
    int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int maxSum = maxSubarraySumOptimal(arr);
    System.out.println("maximum subarray sum: " + maxSum);
  }
}
