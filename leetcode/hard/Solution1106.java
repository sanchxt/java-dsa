package leetcode.hard;

import java.util.ArrayList;
import java.util.Stack;

public class Solution1106 {
  public char evaluateSubExp(String subExp) {
    char op = subExp.charAt(0);
    String values = subExp.substring(2, subExp.length() - 1);
    if (op == '!') return values.contains("t") ? 'f' : 't';
    if (op == '&') return values.contains("f") ? 'f' : 't';
    if (op == '|') return values.contains("t") ? 't' : 'f';
    return 'f';
  }

  // tc: O(N^2) , sc: O(N)
  public boolean parseBoolExprBrute(String expression) {
    while (expression.length() > 1) {
      int start = Math.max(
        expression.lastIndexOf('!'),
        Math.max(
          expression.lastIndexOf('&'),
          expression.lastIndexOf('|')
        )
      );
      int end = expression.indexOf(')', start);
      String subExp = expression.substring(start, end + 1);
      char result = evaluateSubExp(subExp);
      expression = expression.substring(0, start) + result + expression.substring(end + 1);
    }
    return expression.charAt(0) == 't';
  }

  int index = 0;
  public boolean evaluate(String exp) {
    char currChar = exp.charAt(index++);
    if (currChar == 't') return true;
    if (currChar == 'f') return false;

    if (currChar == '!') {
      index++; // skipping '('
      boolean result = !evaluate(exp);
      index++; // skipping ')'
      return result;
    }

    ArrayList<Boolean> values = new ArrayList<>();
    index++; // skip '('
    while (exp.charAt(index) != ')') {
      if (exp.charAt(index) != ',')
        values.add(evaluate(exp));
      else index++;
    }
    index++;

    if (currChar == '&') {
      for (Boolean v : values)
        if (!v) return false;
      return true;
    }

    if (currChar == '|') {
      for (Boolean v : values)
        if (v) return true;
      return false;
    }
    return false;
  }
  // tc: O(N) , sc: O(N)
  public boolean parseBoolExprBetter(String expression) {
    return evaluate(expression);
  }

  // tc: O(N) , sc: O(N)
  public boolean parseBoolOptimal(String expression) {
    Stack<Character> st = new Stack<>();
    for (char currChar : expression.toCharArray()) {
      if (currChar == ',' || currChar == '(') continue;
      if (
        currChar == 't' ||
        currChar == 'f' ||
        currChar == '!' ||
        currChar == '&' ||
        currChar == '|'
      ) st.push(currChar);
      else if (currChar == ')') {
        boolean hasTrue = false, hasFalse = false;
        while (st.peek() != '!' && st.peek() != '&' && st.peek() != '|') {
          char topVal = st.pop();
          if (topVal == 't') hasTrue = true;
          if (topVal == 'f') hasFalse = true;
        }
        char op = st.pop();
        if (op == '!') st.push(hasTrue ? 'f' : 't');
        else if (op == '&') st.push(hasFalse ? 'f' : 't');
        else st.push(hasTrue ? 't' : 'f');
      }
    }
    return st.peek() == 't';
  }
}
