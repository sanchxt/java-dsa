package patterns;

// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********

public class Pattern19 {
  public static void pattern(int n) {
    int spaces = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i; j++) {
        System.out.print("*");
      }

      for (int j = 0; j < spaces; j++) {
        System.out.print(" ");
      }

      for (int j = 0; j < n - i; j++) {
        System.out.print("*");
      }
      spaces += 2;
      System.out.println();
    }

    spaces = 2 * n - 2;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }

      for (int j = 0; j < spaces; j++) {
        System.out.print(" ");
      }

      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }
      spaces -= 2;
      System.out.println();
    }
  }

  public static void main(String[] args) {
    pattern(5);
  }
}
