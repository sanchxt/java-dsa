package patterns;

// *        *
// **      **
// ***    ***
// ****  ****
// **********
// ****  ****
// ***    ***
// **      **
// *        *

public class Pattern20 {
  public static void pattern(int n) {
    for (int i = 0; i < 2 * n; i++) {
      int stars = i < n ? i : 2 * n - i;
      int spaces = 2 * (n - stars);

      for (int j = 0; j < stars; j++) {
        System.out.print("*");
      }

      for (int j = 0; j < spaces; j++) {
        System.out.print(" ");
      }

      for (int j = 0; j < stars; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    pattern(5);
  }
}
