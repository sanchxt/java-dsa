package A2Z.basic_maths;

public class Armstrong {
  public static boolean isArmstrong(int n) {
    int k = String.valueOf(n).length();
    int sum = 0;
    int temp = n;
    while (temp > 0) {
      int lastDigit = temp % 10;
      sum += Math.pow(lastDigit, k);
      temp = temp / 10;
    }
    return sum == n ? true : false;
  }

  public static void main(String[] args) {
    int num = 153;
    System.out.println("Numbers: " + num);
    System.out.println("Is armstrong: " + isArmstrong(num));
  }
}
