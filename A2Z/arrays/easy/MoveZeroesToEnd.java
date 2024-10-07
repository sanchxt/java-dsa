package A2Z.arrays.easy;

public class MoveZeroesToEnd {
  static void displayArr(int arr[]) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  static int[] moveZeroes(int arr[]) {
    int j = -1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
         j = i;
         break;
      }
    }
    // no 0 found
    if (j == -1) return arr;

    for (int i = j + 1; i < arr.length; i++) {
      if (arr[i] != 0) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        j++;
      }
    }
    return arr;
  }

  public static void main(String[] args) {
    int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
    int[] ans = moveZeroes(arr);
    displayArr(ans);
  }
}
