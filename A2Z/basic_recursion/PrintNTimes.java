package A2Z.basic_recursion;

public class PrintNTimes {
  static void print(int n) {
    int count = 1;
    if (count > n) return;
    System.out.println("sanchxt");
    print(n - 1);
  }

  public static void main(String[] args) {
    print(5);
  }
}
