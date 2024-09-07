public class PalindromeString {
  public boolean isPalindrome(String word) {
    char[] charArray = word.toCharArray();
    int start = 0;
    int end = charArray.length - 1;

    while (start < end) {
        if (charArray[start] != charArray[end]) {
            return false;
        }
        start++;
        end--;
    }
    return true;
  }

  public static void main(String[] args) {
    PalindromeString stringUtil = new PalindromeString();
    if (stringUtil.isPalindrome("heh")) {
      System.out.println("it's a palindrome");
    } else {
      System.out.println("it's not a palindrome");
    }
  }
}
