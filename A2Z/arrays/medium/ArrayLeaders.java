import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeaders {
  // tc: O(N^2) , sc: O(N)
  static ArrayList<Integer> leadersBruteForce(int arr[], int n) {
    ArrayList<Integer> result = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      boolean leader = true;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] > arr[i]) {
          leader = false;
          break;
        }
      }
      if (leader) result.add(arr[i]);
    }
    return result;
  }

  static ArrayList<Integer> leadersOptimal(int arr[], int n) {
    ArrayList<Integer> result = new ArrayList<>();
    int max = arr[n - 1];
    result.add(max);

    for (int i = n - 2; i >= 0; i--) {
      if (arr[i] > max) {
        result.add(arr[i]);
        max = arr[i];
      }
    }
    Collections.sort(result, Collections.reverseOrder());
    return result;
  }

  public static void main(String[] args) {
    int n = 6;
    int arr[]=  {10, 22, 12, 3, 0, 6};
    ArrayList<Integer> ans= leadersOptimal(arr, n);
    for (int i = 0; i < ans.size(); i++) {
      System.out.print(ans.get(i) + " ");
    }
  }
}
