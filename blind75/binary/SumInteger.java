package blind75.binary;

public class SumInteger {
  // tc: O(1) -> number of iterations are bounded by the number of bits in an integer (32 or 64 generally, so the iterations are fixed)
  // sc: O(1)
  static int getSum(int a, int b) {
    int c;
    while (b != 0) {
      c = a & b;
      a = a ^ b;
      b = c << 1;
    }
    return a;
  }

  public static void main(String[] args) {
    int result = getSum(3, 2);
    System.out.println("sum is: " + result);
  }
}
