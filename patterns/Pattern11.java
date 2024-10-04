package patterns;

// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

public class Pattern11 {
  public static void pattern(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.err.print((i + j + 1) % 2 + " ");
      }
      System.err.println();
    }
  }

  public static void main(String[] args) {
    pattern(5);
  }
}
