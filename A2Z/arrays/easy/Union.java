package A2Z.arrays.easy;

import java.util.ArrayList;

public class Union {
  static void displayArr(ArrayList<Integer> arr) {
    for (int val : arr) {
      System.out.print(val + " ");
    }
  }

  static ArrayList<Integer> getUnion(int arr1[], int arr2[]) {
    int i = 0, j = 0;
    ArrayList<Integer> union = new ArrayList<>();
    while (i < arr1.length && j < arr2.length) {
      if (arr1[i] <= arr2[j]) {
        if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
          union.add(arr1[i]);
        }
        i++;
      } else {
        if (union.size() == 0 || union.get(union.size() - 1) != arr2[j]) {
          union.add(arr2[j]);
        }
        j++;
      }
    }

    while (i < arr1.length) {
      if (union.get(union.size() - 1) != arr1[i]) {
        union.add(arr1[i]);
      }
      i++;
    }

    while (j < arr2.length) {
      if (union.get(union.size() - 1) != arr2[j]) {
        union.add(arr2[j]);
      }
      j++;
    }
    return union;
  }

  public static void main(String[] args) {
    int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int arr2[] = {2, 3, 4, 4, 5, 11, 12};
    ArrayList<Integer> union = getUnion(arr1, arr2);
    displayArr(union);
  }
}
