package patterns;

// 1
// 12
// 123
// 1234
// 12345

public class Pattern03 {
  public static void pattern(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(j + 1);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    pattern(5);
  }
}
