package blind75.arrays;

public class MinRotatedArray {
  // tc: O(N) , sc: O(1)
  static int findMinBrute(int arr[]) {
    int n = arr.length;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++)
      min = Math.min(min, arr[i]);
    return min;
  }

  // tc: O(logN) , sc: O(1)
  static int findMinOptimal(int arr[]) {
    int low = 0, high = arr.length - 1;
    int ans = Integer.MAX_VALUE;
    while (low <= high) {
      int mid = (low + high) / 2;
      // subarray to the left of mid is sorted
      if (arr[low] <= arr[mid]) {
        ans = Math.min(ans, arr[low]);
        low = mid + 1;
      } else {
          ans = Math.min(ans, arr[mid]);
          high = mid - 1;
      }
    }
    return ans;
  }

  // if the complete array is already sorted, we can just return the element at index 0
  // we can implement a check for this to optimise the optimal algo even further
  // tc: O(logN) , sc: O(1)
  static int findMinOptimalOptimised(int arr[]) {
    int low = 0, high = arr.length -1;
    int ans = Integer.MAX_VALUE;
    while (low <= high) {
      int mid = (low + high) / 2;
      // complete array is already sorted
      if (arr[low] <= arr[high]) {
        ans = arr[low];
        break;
      }

      if (arr[low] <= arr[mid]) {
        ans = Math.min(ans, arr[low]);
        low = mid + 1;
      } else {
        ans = Math.min(ans, arr[mid]);
        high = mid - 1;
      }
    }
    return ans;
  }

  // even more optimized:
  static int findMinOptimalOptimised2(int arr[]) {
    int low = 0, high = arr.length - 1;
    while (low < high) {
      int mid = low + (high - low) / 2;
      if (arr[mid] > arr[high]) low = mid + 1;
      else high = mid;
    }
    return arr[low];
  }

  public static void main(String[] args) {
    int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};
    int ans = findMinOptimalOptimised2(arr);
    System.out.println("minimum element is: " + ans);
  }
}
