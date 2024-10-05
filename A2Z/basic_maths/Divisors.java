package A2Z.basic_maths;

import java.util.ArrayList;

public class Divisors {
  public static ArrayList<Integer> divisors(int n) {
    ArrayList<Integer> divisors = new ArrayList<>();
    int sqrtNum = (int) Math.sqrt(n);

    for (int i = 1; i <= sqrtNum; i++) {
      if (n % i == 0) {
        divisors.add(i);
        // because, if i is a divisor of n, then n / i is also a divisor of n
        if (i != n / i) divisors.add(n / i);
      }
    }
    return divisors;
  }

  public static void main(String[] args) {
    int num = 36;
    System.out.println("Numbers: " + num);
    System.out.println("Divisors: " + divisors(num));
  }
}
