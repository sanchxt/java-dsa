package A2Z.sorting;

public class InsertionSort {
  static void displayArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  static void insertionSort(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      int j = i;
      while (j > 0 && arr[j - 1] > arr[j]) {
        int temp = arr[j - 1];
        arr[j - 1] = arr[j];
        arr[j] = temp;
        j--;
      }
    }

    displayArr(arr);
  }

  public static void main(String[] args) {
    int arr[] = {13, 46, 24, 52, 20, 9};
    insertionSort(arr);
  }
}
