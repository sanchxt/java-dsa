package patterns;

// * * * * *
// * * * *
// * * *
// * *
// *

public class Pattern05 {
  public static void pattern(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = n; j > i; j--) {
        System.err.print("* ");
      }
      System.err.println();
    }
  }

  public static void main(String[] args) {
    pattern(5);
  }
}
