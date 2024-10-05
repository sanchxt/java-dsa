package A2Z.basic_maths;

public class ReverseNumber {
  public static int reverseNum(int n) {
    int revNum = 0;
    boolean isNegative = n < 0;
    n = Math.abs(n);
    while (n > 0) {
      // handle overflow
      if (revNum > Integer.MAX_VALUE / 10 ||
         (revNum == Integer.MAX_VALUE / 10 && n % 10 > Integer.MAX_VALUE % 10)) {
        return 0;
      }

      int lastDigit = n % 10;
      revNum = (revNum * 10) + lastDigit;
      n = n / 10;
    }
    return isNegative ? -revNum : revNum;
  }

  public static void main(String[] args) {
    int num = 2348;
    System.out.println("Number: " + num);
    System.out.println("Reverse: " + reverseNum(num));
  }
}
