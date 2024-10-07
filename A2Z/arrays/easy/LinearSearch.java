package A2Z.arrays.easy;

public class LinearSearch {
  static void searchNum(int arr[], int num) {
    for (int i : arr) {
      if (i == num) {
        System.out.println("Element's in the array");
        return;
      }
    }
    System.out.println("Element isn't in the array");
  }

  public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 5};
    searchNum(arr, 4);
  }
}
