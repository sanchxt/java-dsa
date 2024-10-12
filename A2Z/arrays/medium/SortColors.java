import java.util.ArrayList;
import java.util.Arrays;

public class SortColors {
  static void displayarr(ArrayList<Integer> arr) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  // DUTCH NATIONAL FLAG ALGO
  static void sortArray(ArrayList<Integer> arr) {
    int low = 0, mid = 0, high = arr.size() - 1;
    while (mid <= high) {
      if (arr.get(mid) == 0) {
        int temp = arr.get(low);
        arr.set(low, arr.get(mid));
        arr.set(mid, temp);
        low++;
        mid++;
      } else if (arr.get(mid) == 1) mid++;
      else {
        int temp = arr.get(mid);
        arr.set(mid, arr.get(high));
        arr.set(high, temp);
        high--;
      }
    }
  }

  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));
    sortArray(arr);
    displayarr(arr);
  }
}
