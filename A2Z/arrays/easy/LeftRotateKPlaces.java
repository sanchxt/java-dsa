package A2Z.arrays.easy;

public class LeftRotateKPlaces {
  static void displayArr(int arr[]) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  static void reverseArr(int arr[], int start, int end) {
    while (start <= end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }

  static void leftRotateByKPlaces(int arr[], int k) {
    reverseArr(arr, 0, k - 1); // reverse first k elements
    reverseArr(arr, k, arr.length - 1); // reverse last n-k elements
    reverseArr(arr, 0, arr.length - 1); // reverse the whole array
  }

  public static void main(String[] args) {
    int arr[]= {1, 2, 3, 4, 5};
    leftRotateByKPlaces(arr, 2);
    displayArr(arr);
  }
}
