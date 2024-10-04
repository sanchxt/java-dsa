package patterns;

// A B C D
// A B C
// A B
// A

public class Pattern15 {
  public static void pattern(int n) {
    for (int i = 0; i < n; i++) {
      for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
        System.out.print(ch + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    pattern(4);
  }
}
