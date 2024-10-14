package blind75.arrays;

import java.util.HashMap;

public class TwoSum {
  // tc: O(N^2) , sc: O(1)
  static int[] twoSumBrute(int arr[], int target) {
    int ans[] = new int[2];
    ans[0] = ans[1] = -1;
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (arr[i] + arr[j] == target) {
          ans[0] = i;
          ans[1] = j;
          return ans;
        }
      }
    }
    return ans;
  }

  // tc: O(N) , sc: O(N)
  static int[] twoSumBetter(int arr[], int target) {
    int ans[] = new int[2];
    ans[0] = ans[1] = -1;
    HashMap<Integer, Integer> mpp = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      int num = arr[i];
      int numNeeded = target - num;
      if (mpp.containsKey(numNeeded)) {
        ans[0] = mpp.get(numNeeded);
        ans[1] = i;
        return ans;
      }
      mpp.put(arr[i], i);
    }
    return ans;
  }

  public static void main(String[] args) {
    int[] arr = {2, 6, 5, 8, 11};
    int target = 14;
    int[] ans = twoSumBetter(arr, target);
    System.out.println("result: [" + ans[0] + ", " + ans[1] + "]");
  }
}
