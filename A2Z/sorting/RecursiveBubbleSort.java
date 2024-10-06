public class RecursiveBubbleSort {
  static void displayArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  static void recursiveBubbleSort(int arr[], int n) {
    if (n == 1) return;

    int didSwap = 0;
    for (int i = 0; i < n - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
        didSwap = 1;
      }
    }
    if (didSwap == 0) return; // already sorted
    recursiveBubbleSort(arr, n - 1);
  }

  public static void main(String[] args) {
    int arr[] = {13, 46, 24, 52, 20, 9};
    recursiveBubbleSort(arr, arr.length);
    displayArr(arr);
  }
}
