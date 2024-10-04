package patterns;

// 1
// 22
// 333
// 4444
// 55555

public class Pattern04 {
  public static void pattern(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(i + 1);
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    pattern(5);
  }
}
