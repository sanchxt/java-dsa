package leetcode.easy;

public class Solution125 {
  public boolean isPalindrome(String s) {
    String a = s.toLowerCase();
    int start = 0, last = s.length() - 1;
    while (start <= last) {
      char cf = a.charAt(start);
      char cl = a.charAt(last);
      if (!Character.isLetterOrDigit(cf)) start++;
      else if (!Character.isLetterOrDigit(cl)) last--;
      else {
        if (cf != cl) return false;
        start++;
        last--;
      }
    }
    return true;
  }
}
