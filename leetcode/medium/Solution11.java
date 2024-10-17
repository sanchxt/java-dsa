package leetcode.medium;

public class Solution11 {
  static int maxWater(int arr[]) {
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
}
