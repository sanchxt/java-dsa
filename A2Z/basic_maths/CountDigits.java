package A2Z.basic_maths;

public class CountDigits {
  public static int countDigits(int n) {
    if (n == 0) return 1;
    n = Math.abs(n);
    return (int)(Math.log10(n) + 1);
  }

  public static void main(String[] args) {
    int num = 893274;
    System.out.println("Number: " + num);
    System.out.println("Digits: " + countDigits(num));
  }
}
