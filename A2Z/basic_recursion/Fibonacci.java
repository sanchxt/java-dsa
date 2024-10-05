package A2Z.basic_recursion;

public class Fibonacci {
  static int fibonacci(int n) {
    if (n <= 1) return n;
    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  public static void main(String[] args) {
    for (int i = 0; i < 8; i++) {
      System.out.print(fibonacci(i) + " ");
    }
  }
}
