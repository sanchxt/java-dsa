package blind75.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicates {
  // tc: O(N^2) , sc: O(1)
  static boolean containsDuplicateBrute(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) return true;
      }
    }
    return false;
  }

  // tc: O(N * logN) , sc: O(1)
  static boolean containsDuplicateBetter(int arr[]) {
    Arrays.sort(arr);
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] == arr[i - 1]) return true;
    }
    return false;
  }

  static boolean containsDuplicateOptimal(int arr[]) {
    HashSet<Integer> set = new HashSet<>();
    for (int i : arr)
      if (set.add(i) == false) return true;
    return false;
  }

  public static void main(String[] args) {
    int nums[]= {1, 2, 3, 1};
    System.out.println(containsDuplicateOptimal(nums));
  }
}
