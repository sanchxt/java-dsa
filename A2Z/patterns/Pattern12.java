package A2Z.patterns;

// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321

public class Pattern12 {
  // another method that i came up with, but slightly more complex (although has the same complexity)
  // public static void pattern(int n) {
  //   for (int i = 0; i < n; i++) {
  //     for (int j = 0; j <= i; j++) {
  //       System.out.print(j + 1);
  //     }
  //     for (int j = 0; j < (2 * n) - (2 * (i + 1)); j++) {
  //       System.out.print(" ");
  //     }
  //     for (int j = 0; j <= i; j++) {
  //       System.out.print(j + 1);
  //     }
  //     System.out.println();
  //   }
  // }

 public static void pattern(int n) {
  int spaces = 2 * n - 2;
  for (int i = 0; i < n; i++) {
    for (int j = 0; j <= i; j++) {
      System.out.print(j + 1);
    }

    for (int j = 0; j < spaces; j++) {
      System.out.print(" ");
    }

    for (int j = i; j >= 0; j--) {
      System.err.print(j + 1);
    }

    System.out.println();
    spaces -=2;
  }
}

  public static void main(String[] args) {
    pattern(4);
  }
}
