package blind75.arrays;

public class MaxProductSub {
  // tc: O(N^3) , sc: O(1)
  static int maxProductSubArrayBrute(int arr[]) {
    int n = arr.length;
    int result = Integer.MIN_VALUE;
    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        int product = 1;
        for (int k = i; k <= j; k++)
          product *= arr[k];
        result = Math.max(result, product);
      }
    }
    return result;
  }

  // tc: O(N^2) , sc: O(1)
  static int maxProductSubArrayBetter(int arr[]) {
    int n = arr.length;
    int result = arr[0];
    for (int i = 0; i < n - 1; i++) {
      int prod = arr[i];
      for (int j = i + 1; j < n; j++) {
        result = Math.max(result, prod);
        prod *= arr[j];
      }
      result = Math.max(result, prod);
    }
    return result;
  }

  public static void main(String[] args) {
		int nums[] = {1, 2, -3, 0, -4, -5};
		int answer = maxProductSubArrayBetter(nums);
		System.out.print("max product subarray is: "+ answer);
	}
}
