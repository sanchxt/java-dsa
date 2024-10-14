import java.util.HashMap;

public class NumOfSubarrays {
  // tc: O(N^3) , sc: O(1)
  static int subarraysWithSumKBrute(int arr[], int k) {
    int n = arr.length;
    int count = 0;

    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        int sum = 0;
        for (int K = i; K <= j; K++) sum += arr[K];
        if (sum == k) count++;
      }
    }
    return count;
  }

  // tc: O(N^2) , sc: O(1)
  static int subarraysWithSumKBetter(int arr[], int k) {
    int n = arr.length;
    int count = 0;
    for (int i = 0; i < n; i++) {
      int sum = 0;
      for (int j = i; j < n; j++) {
        sum += arr[j];
        if (sum == k) count++;
      }
    }
    return count;
  }

  // tc: O(N) , sc: O(1)
  static int subarraysWithSumKOptimal(int arr[], int k) {
    int n = arr.length;
    HashMap<Integer, Integer> mpp = new HashMap<>();
    int prefixSum = 0, count = 0;
    mpp.put(0, 1);
    for (int i = 0; i < n; i++) {
      prefixSum += arr[i];
      int difference = prefixSum - k;
      count += mpp.getOrDefault(difference, 0);
      mpp.put(prefixSum, mpp.getOrDefault(prefixSum, 0) + 1);
    }
    return count;
  }

  public static void main(String[] args) {
    int[] arr = {3, 1, 2, 4};
    int k = 6;
    int count = subarraysWithSumKOptimal(arr, k);
    System.out.println("number of subarrays: " + count);
  }
}
