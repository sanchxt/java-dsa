package patterns;

public class Pattern07 {
  public static void pattern(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < (n - i - 1); j++) {
        System.err.print(" ");
      }

      for (int j = 0; j < (2 * i + 1); j++) {
        System.err.print("* ");
      }

      for (int j = 0; j < (n - i - 1); j++) {
        System.err.print(" ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    pattern(5);
  }
}
