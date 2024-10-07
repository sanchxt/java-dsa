package leetcode.medium;

public class Solution189 {
  void reverseArr(int arr[], int start, int end) {
    while (start <= end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;;
    }
  }

  public void rotate(int[] nums, int k) {
    int n = nums.length;
    k = k % n;
    reverseArr(nums, 0, n - k - 1);
    reverseArr(nums, n - k, n -1);
    reverseArr(nums, 0, n - 1);
  }
}
