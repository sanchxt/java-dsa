package A2Z.basic_recursion;

public class Count {
  static int count = 1;
  static void print() {
    if (count == 5) return;
    System.out.println(count);
    count++;
    print();
  }

  public static void main(String[] args) {
    print();
  }
}
