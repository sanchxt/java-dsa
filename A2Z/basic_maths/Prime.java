package A2Z.basic_maths;

public class Prime {
  public static boolean isPrime(int n) {
    if (n <= 1) return false;
    if (n == 2) return true;
    if (n % 2 == 0) return false;

    for (int i = 3; i <= Math.sqrt(n); i++) {
      if (n % i == 0) return false;
    }
    return true;
  }

  public static void main(String[] args) {
    int num = 11;
    System.out.println("Numbers: " + num);
    System.out.println("Is prime: " + isPrime(num));
  }
}
