package A2Z.arrays.easy;

public class SecondLargest {
  static int secondSmallest(int arr[], int n) {
    if (n < 2) return -1;
    int lowest = Integer.MAX_VALUE;
    int second_lowest = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      if (arr[i] < lowest) {
        second_lowest = lowest;
        lowest = arr[i];
      } else if (arr[i] < second_lowest && arr[i] != lowest) {
        second_lowest = arr[i];
      }
    }
    return second_lowest;
  }

  static int secondLargest(int arr[], int n) {
    if (n < 2) return -1;
    int largest = Integer.MAX_VALUE;
    int second_largest = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      if (arr[i] > largest) {
        second_largest = largest;
        largest = arr[i];
      } else if (arr[i] > second_largest && arr[i] != largest) {
        second_largest = arr[i];
      }
    }
    return second_largest;
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 4, 7, 7, 5};
    int n = arr.length;
		int sS = secondSmallest(arr, n);
		int sL = secondLargest(arr, n);
	  System.out.println("Second lowest is "+sS);
	  System.out.println("Second largest is "+sL);
  }
}
