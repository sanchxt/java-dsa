package A2Z.sorting;

public class SelectionSort {
  static void displayArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  static void selectionSort(int arr[]) {
    int n = arr.length;
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

    displayArr(arr);
  }

  public static void main(String[] args) {
    int arr[] = {13, 46, 24, 52, 20, 9};
    selectionSort(arr);
  }
}
