package A2Z.basic_maths;

// euclidean algo: GCD b/w n1 and n2 is (n1 % n2, n2), where n1 > n2 [we keep doing this until we get a 0, in which case, the other (non-zero) number is our actual gcd]

public class GCD {
  public static int findGCD(int n1, int n2) {
    while (n1 > 0 && n2 > 0) {
      if (n1 > n2) {
        n1 = n1 % n2;
      } else {
        n2 = n2 % n1;
      }
    }
    if (n1 == 0) return n2;
    return n1;
  }

  public static void main(String[] args) {
    int num1 = 10, num2 = 15;
    System.out.println("Numbers: " + num1 + ", " + num2);
    System.out.println("HCF (or GCD): " + findGCD(num1, num2));
  }
}
