package A2Z.sorting;

public class BubbleSort {
  static void displayArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  static void bubbleSort(int arr[]) {
    for (int i = arr.length - 1; i >= 0; i--) {
      for (int j = 0; j <= i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

    displayArr(arr);
  }

  public static void main(String[] args) {
    int arr[] = {13, 46, 24, 52, 20, 9};
    bubbleSort(arr);
  }
}
