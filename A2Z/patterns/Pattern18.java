package A2Z.patterns;

// E
// D E
// C D E
// B C D E

public class Pattern18 {
  public static void pattern(int n) {
    for (int i = 0; i < n; i++) {
      for (char ch = (char)(n - i); ch <= n; ch++) {
        System.out.print(ch + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    pattern(4);
  }
}
