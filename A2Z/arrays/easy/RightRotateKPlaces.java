package A2Z.arrays.easy;

public class RightRotateKPlaces {
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

  static void rightRotateByKPlaces(int arr[], int k) {
    int n = arr.length;
    k = k % n;
    reverseArr(arr, 0, n - k - 1); // reverse first n - k elements
    reverseArr(arr, n - k, n - 1); // reverse last k elements
    reverseArr(arr, 0, n - 1); // reverse the whole array
  }

  public static void main(String[] args) {
    int arr[]= {1, 2, 3, 4, 5};
    rightRotateByKPlaces(arr, 2);
    displayArr(arr);
  }
}
