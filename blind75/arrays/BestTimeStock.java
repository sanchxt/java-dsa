package blind75.arrays;

public class BestTimeStock {
  // tc: O(N)  sc: O(1)
  static int maximumProfit(int arr[]) {
    int maxProfit = 0;
    int minPrice = arr[0];
    for (int i = 1; i < arr.length; i++) {
      minPrice = Math.min(minPrice, arr[i]);
      int currentProfit = arr[i] - minPrice;
      maxProfit = Math.max(maxProfit, currentProfit);
    }
    return maxProfit;
  }

  public static void main(String[] args) {
    int[] arr  ={7, 1, 5, 3, 6, 4};
    System.out.println("max possible profit: " + maximumProfit(arr));
  }
}
