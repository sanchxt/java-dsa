public class StockProfit {
  // tc: O(N^2) , sc: O(1)
  static int maxProfitBruteForce(int arr[]) {
    int maxProfit = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] > arr[i]) maxProfit = Math.max(arr[j] - arr[i], maxProfit);
      }
    }
    return maxProfit;
  }

  // tc: O(N) , sc: O(1)
  static int maxProfitOptimal(int arr[]) {
    int maxProfit = 0;
    int minPrice = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      minPrice = Math.min(minPrice, arr[i]);
      maxProfit = Math.max(maxProfit, arr[i] - minPrice);
    }
    return maxProfit;
  }

  public static void main(String[] args) {
    int arr[] = {7,1,5,3,6,4};
    int maxPro = maxProfitOptimal(arr);
    System.out.println("max profit: " + maxPro);
  }
}
