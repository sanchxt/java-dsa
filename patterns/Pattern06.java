package patterns;

// 12345
// 1234
// 123
// 12
// 1

public class Pattern06 {
  public static void pattern(int n) {
    for (int i = n; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print(j + 1);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    pattern(5);
  }
}
