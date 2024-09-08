package sorting;

public class SelectionSort {
  public static void selectionSort(int arr[], int n) {
    for (int i = 0; i < n - 1; i++) {
      int minimum = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] < arr[minimum]) {
          minimum = j;
        }
      }

      int temp = arr[minimum];
      arr[minimum] = arr[i];
      arr[i] = temp;
    }
  }

  public static void displayArray(int arr[], int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public static void main(String[] args) {
    int arr[] = {13, 7, 24, 12, 9};
    int n = arr.length;
    System.out.println("before selection sort:");
    displayArray(arr, n);

    System.out.println("\n\nafter selection sort:");
    selectionSort(arr, n);
    displayArray(arr, n);
  }
}

// time complexity: O(N^2)
// space complexity: O(1)
