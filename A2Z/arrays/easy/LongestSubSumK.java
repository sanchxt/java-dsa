import java.util.HashMap;
import java.util.Map;

public class LongestSubSumK {
  // BETTER SOLUTION
  static int getLongestSubarray(int arr[], int k) {
    int n = arr.length;

    int sum = 0, maxLength = 0;
    Map<Integer, Integer> preSumMap = new HashMap<>();
    for (int i = 0; i < n; i++) {
      sum += arr[i];
      if (sum == k) {
        maxLength = Math.max(maxLength, i + 1);
      }
      int remainingSum = sum - k;
      if (preSumMap.containsKey(remainingSum)) {
        int len = i - preSumMap.get(remainingSum);
        maxLength = Math.max(maxLength, len);
      }

      if (!preSumMap.containsKey(sum)) {
        preSumMap.put(sum, i);
      }
    }

    return maxLength;
  }

  public static void main(String[] args) {
    int[] a = {2, 0, 0, 3};
    int k = 3;
    int len = getLongestSubarray(a, k);
    System.out.println("The length of the longest subarray is: " + len);
  }
}
