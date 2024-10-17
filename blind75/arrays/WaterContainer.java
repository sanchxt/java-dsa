package blind75.arrays;

public class WaterContainer {
  // tc: O(N^2) , sc: O(1)
  static int maxWaterBrute(int arr[]) {
    int maxArea = Integer.MIN_VALUE;
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = i + 1; j < n; j++) {
        int minHeight = Math.min(arr[i], arr[j]);
        int currWidth = j - i;
        maxArea = Math.max(maxArea, (minHeight * currWidth));
      }
    }
    return maxArea;
  }

  static int maxWaterOptimal(int arr[]) {
    int maxArea = Integer.MIN_VALUE;
    int left = 0, right = arr.length - 1;
    while (left < right) {
      int currWidth = right - left;
      int minHeight = Math.min(arr[left], arr[right]);
      maxArea = Math.max(maxArea, currWidth * minHeight);
      if (arr[left] < arr[right]) left++;
      else right--;
    }
    return maxArea;
  }

  public static void main(String[] args) {
    int arr[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    int result = maxWaterOptimal(arr);
    System.out.println("max amount of water in a container: " + result);
  }
}
