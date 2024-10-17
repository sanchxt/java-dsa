package blind75.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
  // tc: O(N^3 * log(no. of unique triplets)) = O(N ^ 3) (because inserting triplets into a set takes O(log(unique triplets)) time)
  // sc: O(2 * no. of unique triplets) (one for set, one for list)
  static List<List<Integer>> tripletsBrute(int n, int arr[]) {
    Set<List<Integer>> st = new HashSet<>();
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        for (int k = j + 1; k < n; k++) {
          if (arr[i] + arr[j] + arr[k] == 0) {
            List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
            temp.sort(null);
            st.add(temp);
          }
        }
      }
    }
    List<List<Integer>> ans = new ArrayList<>(st);
    return ans;
  }

  // tc: O(N^2) , sc: O(2 * no. of unique triplets) + O(N)
  static List<List<Integer>> tripletsBetter(int n, int arr[]) {
    Set<List<Integer>> st = new HashSet<>();
    for (int i = 0; i < n; i++) {
      Set<Integer> hashset = new HashSet<>();
      for (int j = i + 1; j < n; j++) {
        int thirdNum = -(arr[i] + arr[j]);
        if (hashset.contains(thirdNum)) {
          List<Integer> temp = Arrays.asList(arr[i], arr[j], thirdNum);
          temp.sort(null);
          st.add(temp);
        }
        hashset.add(arr[j]);
      }
    }
    List<List<Integer>> ans = new ArrayList<>(st);
    return ans;
  }

  // tc: O(N logN) + O(N ^ 2) but we'll say it as O(N^2)
  // sc: O(no. of triplets) or we can say O(1) since we aren't using any extra space to solve the problem
  static List<List<Integer>> tripletsOptimal(int n, int arr[]) {
    List<List<Integer>> ans = new ArrayList<>();
    Arrays.sort(arr);
    for (int i = 0; i < n; i++) {
      if (i != 0 && arr[i] == arr[i - 1]) continue;
      int j = i + 1;
      int k = n - 1;
      while (j < k) {
        int sum = arr[i] + arr[j] + arr[k];
        if (sum < 0) j++;
        else if (sum > 0) k--;
        else {
          List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
          ans.add(temp);
          j++;
          k--;
          while (j < k && arr[j] == arr[j - 1]) j++;
          while (j < k && arr[k] == arr[k + 1]) k++;
        }
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    int[] arr = { -1, 0, 1, 2, -1, -4};
    int n = arr.length;
    List<List<Integer>> ans = tripletsBrute(n, arr);
    for (List<Integer> it : ans) {
      System.out.print("[");
      for (Integer i : it) {
          System.out.print(i + " ");
      }
      System.out.print("] ");
    }
    System.out.println();
  }
}
