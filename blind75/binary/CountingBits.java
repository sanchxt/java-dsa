package blind75.binary;

public class CountingBits {
  // tc: O(N) , sc: O(1)
  public static int[] countBits(int n) {
    int result[] = new int[n + 1];
    if (n == 0) return result;
    result[0] = 0;
    if (n >= 1) result[1] = 1;

    for (int i = 2; i <= n; i++) {
      if (i % 2 == 0) result[i] = result[i / 2];
      else result[i] = result[i / 2] + 1;
    }
    return result;
  }

  public static void main(String[] args) {
    int arr[] = countBits(3);
    System.out.print("[ ");
    for (int i : arr) System.out.print(i + " ");
    System.out.print("]");
  }
}
