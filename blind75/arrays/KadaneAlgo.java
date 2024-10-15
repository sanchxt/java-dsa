package blind75.arrays;

public class KadaneAlgo {
  // tc: O(N^3) , sc: O(1)
  static int maxSubarraySumBrute(int arr[], int n) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        int sum = 0;
        for (int k = i; k <= j; k++)
          sum += arr[k];
        max = Math.max(max, sum);
      }
    }
    return max;
  }

  // tc: O(N^2) , sc: O(1)
  static int maxSubarraySumBetter(int arr[], int n) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      int sum = 0;
      for (int j = i; j < n; j++) {
        sum += arr[j];
        max = Math.max(max, sum);
      }
    }
    return max;
  }

  // kadane's algo:
  // tc: O(N) , sc: O(1)
  static int maxSubarraySumOptimal(int arr[], int n) {
    int max = Integer.MIN_VALUE;
    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += arr[i];
      if (sum > max) max = sum;
      if (sum < 0) sum = 0;
    }
    if (max < 0) max = 0; // sum of empty array
    return max;
  }

  // follow up to kadane's algo: print the array
  static int maxSubarraySumOptimalPrint(int arr[], int n) {
    int max = Integer.MIN_VALUE;
    int sum = 0;
    int start = 0;
    int resultStart = -1, resultEnd = - 1;
    for (int i = 0; i < n; i++) {
      if (sum == 0) start = i;
      sum += arr[i];
      if (sum > max) {
        max = sum;
        resultStart = start;
        resultEnd = i;
      }
      if (sum < 0) sum = 0;
    }

    System.out.print("subarray is: [ ");
    for (int i = resultStart; i <= resultEnd; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.print("]");
    return max;
  }

  public static void main(String args[]) {
    int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int n = arr.length;
    int maxSum = maxSubarraySumOptimalPrint(arr, n);
    System.out.println("\nmax subarray: " + maxSum);
  }
}
