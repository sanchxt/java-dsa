package blind75.arrays;

import java.util.Arrays;

public class ProductExceptSelf {
  static void displayArr(int arr[]) {
    System.out.print("[ ");
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.print("]");
  }

  // tc: O(N^2) , sc: O(N)
  static int[] productExceptSelfBrute(int arr[]) {
    int n = arr.length;
    int ans[] = new int[n];
    for (int i = 0; i < n; i++) {
      int product = 1;
      for (int j = 0; j < n; j++) {
        if (i != j) product *= arr[j];
      }
      ans[i] = product;
    }
    return ans;
  }

  // tc: O(N) + O(N) = O(2N), we can say it as O(N) , sc: O(N)
  // there's an edge case here left unsolved. we can't divide by 0, so if we have a 0 element, it won't work.
  static int[] productExceptSelfBetter(int arr[]) {
    int n = arr.length;
    int ans[] = new int[n];
    int product = 1;
    for (int i : arr) product *= i;
    for (int i = 0; i < n; i++)
      ans[i] = product / arr[i];
    return ans;
  }

  // tc: O(N) , sc: O(N)
  static int[] productExceptSelfBetterFixed(int arr[]) {
    int n = arr.length;
    int pre[] = new int[n];
    int suff[] = new int[n];
    pre[0] = suff[n - 1] = 1;
    for (int i = 1; i < n; i++)
      pre[i] = pre[i - 1] * arr[i - 1];
    for (int i = n - 2; i >= 0; i--)
      suff[i] = suff[i + 1] * arr[i + 1];
    int ans[] = new int[n];
    for (int i = 0; i < n; i++)
      ans[i] = pre[i] * suff[i];
    return pre;
  }

  // tc: O(N) , sc: O(1)
  static int[] productExceptSelfOptimal(int arr[]) {
    int n = arr.length;
    int ans[] = new int[n];
    Arrays.fill(ans, 1);
    int current = 1;
    for (int i = 0; i < n; i++) {
      ans[i] *= current;
      current *= arr[i];
    }
    current = 1;
    for (int i = n - 1; i >= 0; i--) {
      ans[i] *= current;
      current *= arr[i];
    }
    return ans;
  }

  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4};
    arr = productExceptSelfOptimal(arr);
    displayArr(arr);
  }
}
