package patterns;

public class Pattern13 {
  public static void pattern(int n) {
    int num = 1;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(num + " ");
        num += 1;
      }
      System.err.println();
    }
  }

  public static void main(String[] args) {
    pattern(4);
  }
}
