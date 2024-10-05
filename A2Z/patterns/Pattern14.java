package A2Z.patterns;

// A
// A B
// A B C
// A B C D

public class Pattern14 {
  public static void pattern(int n) {
    for (int i = 0; i < n; i++) {
      for (char ch = 'A'; ch <= 'A' + i; ch++) {
        System.out.print(ch + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    pattern(4);
  }
}
