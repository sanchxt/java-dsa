package patterns;

//        *
//       ***
//      *****
//     *******
//    *********
//   ***********
//  *************
//   ***********
//    *********
//     *******
//      *****
//       ***
//        *

public class Pattern09 {
  public static void pattern1(int n) {
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

  public static void pattern2(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.err.print(" ");
      }

      for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
        System.err.print("* ");
      }

      for (int j = 0; j <= i; j++) {
        System.err.print(" ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    pattern1(5);
    pattern2(5);
  }
}
