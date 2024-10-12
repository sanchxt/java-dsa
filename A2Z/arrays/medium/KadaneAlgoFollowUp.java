public class KadaneAlgoFollowUp {
  // tc: O(N) , sc: O(1)
  static long maxSubarraySum(int arr[]) {
    long maximum = Long.MIN_VALUE;
    long sum = 0;
    int start = 0, resultStart = -1, resultEnd = -1;
    for (int i = 0; i < arr.length; i++) {
      if (sum == 0) start = i;
      sum += arr[i];
      if (sum > maximum) {
        maximum = sum;
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
    return maximum;
  }

  public static void main(String[] args) {
    int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
    long maxSum = maxSubarraySum(arr);
    System.out.println("\nThe maximum subarray sum is: " + maxSum);
  }
}
