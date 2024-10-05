package A2Z.basic_recursion;

public class Print1ToN {
  static void print(int n) {
    int count = n;
    if (count < 1) return;
    print(--count);
    System.out.println(n);
  }

  public static void main(String[] args) {
    print(4);
  }
}
