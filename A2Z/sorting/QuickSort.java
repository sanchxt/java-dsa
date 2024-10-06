import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class QuickSort {
  static void displayArr(List<Integer> arr) {
    for (int i = 0; i < arr.size(); i++) {
      System.out.print(arr.get(i) + " ");
    }
  }

  static int partition(List<Integer> arr, int low, int high) {
    int pivot = arr.get(low);
    int i = low, j = high;

    while (i < j) {
      while (arr.get(i) <= pivot && i <= high - 1) {
        i++;
      }
      while (arr.get(j) > pivot && j >= low + 1) {
        j--;
      }
      if (i < j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
      }
    }

    int temp = arr.get(low);
    arr.set(low, arr.get(j));
    arr.set(j, temp);
    return j;
  }

  static void qs(List<Integer> arr, int low, int high) {
    if (low < high) {
      int partitionIndex = partition(arr, low, high);
      qs(arr, low, partitionIndex - 1);
      qs(arr, partitionIndex + 1, high);
    }
  }

  static List<Integer> quickSort(List<Integer> arr) {
    qs(arr, 0, arr.size() - 1);
    return arr;
  }

  public static void main(String[] args) {
    List<Integer> arr = new ArrayList<>();
    arr = Arrays.asList(new Integer[] {13, 46, 24, 52, 20, 9});
    quickSort(arr);
    displayArr(arr);
  }
}
