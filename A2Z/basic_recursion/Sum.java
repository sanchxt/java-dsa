package A2Z.basic_recursion;

public class Sum {
  static int sum(int n) {
    if (n <= 0) return 0;
    return n + sum(n - 1);
  }

  public static void main(String[] args) {
    System.out.println(sum(4));
  }
}
