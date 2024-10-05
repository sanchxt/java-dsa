package A2Z.patterns;

// *
// * *
// * * *
// * * * *
// * * * * *
// * * * *
// * * *
// * *
// *

public class Pattern10 {
  public static void pattern(int n) {
    int totalRows = 2 * n - 1;
    for (int i = 0; i < totalRows; i++) {
      int stars = i < n ? i + 1 : totalRows - i;
      for (int j = 0; j < stars; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    pattern(5);
  }
}
