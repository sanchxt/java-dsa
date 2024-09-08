package sorting;

public class InsertionSort {
  public static void displayArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void insertionSort(int arr[], int n) {
    for (int i = 0; i <= n - 1; i++) {
      int j = i;
      while (j > 0 && arr[j - 1] > arr[j]) {
        int temp = arr[j - 1];
        arr[j - 1] = arr[j];
        arr[j] = temp;
        j--;
      }
    }
  }

  public static void main(String[] args) {
    int arr[] = {13, 7, 24, 12, 9};
    int n = arr.length;
    System.out.println("before insertion sort:");
    displayArray(arr, n);

    System.out.println("\n\nafter insertion sort:");
    insertionSort(arr, n);
    displayArray(arr, n);
  }
}

// time complexity: O(N^2)
// space complexity: O(1)
