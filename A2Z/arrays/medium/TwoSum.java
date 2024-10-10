package A2Z.arrays.medium;

import java.util.HashMap;

public class TwoSum {
  static int[] twoSum(int arr[], int target) {
    int result[] = new int[2];
    HashMap<Integer, Integer> mpp = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      int complement = target - arr[i];
      if (mpp.containsKey(complement))
        return new int[] { mpp.get(complement), i };
      mpp.put(arr[i], i);
    }
    return result;
  }

  public static void main(String[] args) {
    int[] arr = {2, 6, 5, 8, 11};
    int target = 14;
    int[] ans = twoSum(arr, target);
    System.out.println("[" + ans[0] + ", " + ans[1] + "]");
  }
}
