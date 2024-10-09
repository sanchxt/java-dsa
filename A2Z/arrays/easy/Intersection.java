import java.util.ArrayList;

public class Intersection {
  static void displayArr(ArrayList<Integer> arr) {
    for (int val : arr) {
      System.out.print(val + " ");
    }
  }

  static ArrayList<Integer> getIntersection(int arr1[], int arr2[]) {
    int i = 0, j = 0;
    ArrayList<Integer> intersection = new ArrayList<>();

    while (i < arr1.length && j < arr2.length) {
      if (arr1[i] < arr2[j]) i++;
      else if (arr1[i] > arr2[j]) j++;
      else {
        intersection.add(arr1[i]);
        i++;
        j++;
      }
    }

    return intersection;
  }

  public static void main(String[] args) {
    int arr1[] = {1, 2, 2, 3, 3, 4, 5, 6};
    int arr2[] = {2, 3, 3, 5, 6, 6, 7};
    ArrayList<Integer> union = getIntersection(arr1, arr2);
    displayArr(union);
  }
}
