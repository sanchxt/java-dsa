import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestSequence {
  static boolean linearSearch(int arr[], int num) {
    for (int i = 0; i < arr.length; i++)
      if (arr[i] == num) return true;
    return false;
  }

  // tc: O(N^2), sc: O(1)
  static int longestSequenceBruteForce(int arr[]) {
    int longest = 1;
    for (int i = 0; i < arr.length; i++) {
      int elem = arr[i];
      int count = 1;
      while (linearSearch(arr, elem + 1) == true) {
        elem++;
        count++;
      }
      longest = Math.max(longest, count);
    }
    return longest;
  }

  // tc: O(N logN) + O(N)
  static int longestSequenceBetterApproach(int arr[]) {
    if (arr.length == 0) return 0;
    Arrays.sort(arr);
    int lastSmaller = Integer.MIN_VALUE;
    int count = 0, longest = 1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == lastSmaller + 1) {
        count++;
        lastSmaller = arr[i];
      } else if (arr[i] != lastSmaller) {
        count = 1;
        lastSmaller = arr[i];
      }
      longest = Math.max(longest, count);
    }
    return longest;
  }

  // tc: O(3N) , sc: O(N)
  static int longestSequenceOptimal(int arr[]) {
    if (arr.length == 0) return 0;
    int longest = 1;
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
      set.add(arr[i]);
    }

    for (int num : set) {
      if (!set.contains(num - 1)) {
        int count = 1;
        int elem = num;
        while (set.contains(elem + 1)) {
          elem++;
          count++;
        }
        longest = Math.max(longest, count);
      }
    }
    return longest;
  }

  public static void main(String[] args) {
    int[] arr = {100, 200, 1, 2, 201, 3, 4};
    int ans = longestSequenceOptimal(arr);
    System.out.println("longest consecutive sequence is: " + ans);
  }
}
