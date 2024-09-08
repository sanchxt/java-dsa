package sorting;

public class BubbleSort {
  public static void displayArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void bubbleSort(int arr[], int n) {
    for (int i = n - 1; i >= 0; i--) {
      boolean didSwap = false;
      for (int j = 0; j <= i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          didSwap = true;
        }
      }

      if (didSwap == false) break;
    }
  }

  public static void main(String[] args) {
    int arr[] = {13, 7, 24, 12, 9};
    int n = arr.length;
    System.out.println("before bubble sort:");
    displayArray(arr, n);

    System.out.println("\n\nafter bubble sort:");
    bubbleSort(arr, n);
    displayArray(arr, n);
  }
}

// time complexity: O(N^2)
// space complexity: O(1)
