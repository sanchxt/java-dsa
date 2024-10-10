public class LongestSubSumKPositive {
  static int getLongestSubarray(int arr[], int k) {
    int n = arr.length;
    int left = 0, right = 0;
    int sum = arr[0];
    int maxLength = 0;
    while (right < n) {
      while (left <= right && sum > k) {
        sum -= arr[left];
        left++;
      }
      if (sum == k) {
        maxLength = Math.max(maxLength, right - left + 1);
      }
      sum += arr[right++];
    }
    return maxLength;
  }

  public static void main(String[] args) {
    int[] a = {2, 3, 5, 1, 9};
    int k = 10;
    int len = getLongestSubarray(a, k);
    System.out.println("The length of the longest subarray is: " + len);
  }
}
