package A2Z.basic_recursion;

import java.util.Arrays;

public class ReverseArray {
  static void printArr(int arr[]) {
    System.out.println("reversed array: ");
    System.out.println(Arrays.toString(arr));
  }

  static void reverseArr(int arr[], int start, int end) {
    if (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      reverseArr(arr, start + 1, end - 1);
    }
  }

  public static void main(String[] args) {
    int arr[] = {4, 3, 2, 1};
    reverseArr(arr, 0, arr.length - 1);
    printArr(arr);
  }
}
