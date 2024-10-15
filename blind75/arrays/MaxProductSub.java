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

  // tc: O(N) , sc: O(1)
  static int maxProductSubArrayOptimal(int arr[]) {
    int n = arr.length;
    int pre = 1, suff = 1;
    int ans = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      if (pre == 0) pre = 1;
      if (suff == 0) suff = 1;
      pre *= arr[i];
      suff *= arr[n - i - 1];
      ans = Math.max(ans, Math.max(pre, suff));
    }
    return ans;
  }

  // tc: O(N) , sc: O(1)
  // AVOID TELLING THIS ALGO!
  static int maxProductSubArrayOptimal2(int arr[]) {
    int prod1 = arr[0], prod2 = arr[0], result = arr[0];
    for (int i = 1; i < arr.length; i++) {
      int temp = Math.max(arr[i], Math.max(prod1 * arr[i], prod2 * arr[i]));
      prod2 = Math.min(arr[i], Math.min(prod1 * arr[i], prod2 * arr[i]));
      prod1 = temp;
      result = Math.max(result, prod1);
    }
    return result;
  }

  public static void main(String[] args) {
		int nums[] = {1, 2, -3, 0, -4, -5};
		int answer = maxProductSubArrayOptimal2(nums);
		System.out.print("max product subarray is: "+ answer);
	}
}
