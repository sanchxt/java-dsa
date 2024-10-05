package A2Z.basic_maths;

public class Palindrome {
  public static boolean palindrome(int n) {
    int revNum = 0;
    int dupNum = Math.abs(n);
    while (dupNum > 0) {
      int lastDigit = dupNum % 10;
      revNum = (revNum * 10) + lastDigit;
      dupNum = dupNum / 10;
    }
    if (Math.abs(n) == revNum) return true;
    return false;
  }

  public static void main(String[] args) {
    int num = 2332;
    System.out.println("Number: " + num);
    System.out.println("Is palindrome: " + palindrome(num));
  }
}
