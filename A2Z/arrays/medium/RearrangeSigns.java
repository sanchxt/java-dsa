import java.util.ArrayList;

public class RearrangeSigns {
  // tc: O(N + N / 2) , sc: O(N)
  static int[] rearrangeBySignBrute(int arr[], int n) {
    ArrayList<Integer> positives = new ArrayList<>();
    ArrayList<Integer> negatives = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      if (arr[i] > 0) positives.add(arr[i]);
      else negatives.add(arr[i]);
    }

    for (int i = 0; i < (n / 2); i++) {
      arr[2 * i] = positives.get(i);
      arr[2 * i + 1] = negatives.get(i);
    }
    return arr;
  }

  // tc: O(N) , sc: O(N)
  static int[] rearrangeBySignOptimal(int arr[], int n) {
    int ans[] = new int[n];
    int positiveIndex = 0, negativeIndex = 1;
    for (int i = 0; i < n; i++) {
      if (arr[i] < 0) {
        ans[negativeIndex] = arr[i];
        negativeIndex += 2;
      } else {
        ans[positiveIndex] = arr[i];
        positiveIndex += 2;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    int n = 4;
    int arr[] = {1, 2, -4, -5};
    int ans[] = rearrangeBySignOptimal(arr, n);
    for (int i = 0; i < n; i++) {
      System.out.print(ans[i] + ", ");
    }
  }
}
