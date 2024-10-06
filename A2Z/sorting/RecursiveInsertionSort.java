public class RecursiveInsertionSort {
  static void displayArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  static void recursiveInsertionSort(int arr[], int start, int end) {
    if (start == end) return;

    int i = start;
    while (i > 0 && arr[i - 1] > arr[i]) {
      int temp = arr[i - 1];
      arr[i - 1] = arr[i];
      arr[i] = temp;
      i--;
    }
    recursiveInsertionSort(arr, start + 1, end);
  }

  public static void main(String[] args) {
    int arr[] = {13, 46, 24, 52, 20, 9};
    recursiveInsertionSort(arr, 0, arr.length);
    displayArr(arr);
  }
}
