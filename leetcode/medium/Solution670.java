package leetcode.medium;

public class Solution670 {
  // tc: O(N^2) , sc: O(n)
  public int maximumSwapBrute(int num) {
    String numStr = Integer.toString(num);
    int n = numStr.length();
    int maxNum = num;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        char[] numeral = numStr.toCharArray();
        char temp = numeral[i];
        numeral[i] = numeral[j];
        numeral[j] = temp;
        int tempNum = Integer.parseInt(new String(numeral));
        maxNum = Math.max(maxNum, tempNum);
      }
    }
    return maxNum;
  }

  // tc: O(N^2) , sc: O(N)
  public int maximumSwapBetter(int num) {
    String numStr = Integer.toString(num);
    int n = numStr.length();
    int lastSeen[] = new int[10]; // digits 0-9
    for (int i = 0; i < n; i++) {
      lastSeen[numStr.charAt(i) - '0'] = i;
    }

    for (int i = 0; i < n; i++) {
      for (int d = 9; d > numStr.charAt(i) - '0'; d--) {
        if (lastSeen[d] > i) {
          char arr[] = numStr.toCharArray();
          char temp = arr[i];
          arr[i] = arr[lastSeen[d]];
          arr[lastSeen[d]] = temp;
          numStr = new String(arr);
          return Integer.parseInt(numStr);
        }
      }
    }
    return num;
  }

  // tc: O(N) , sc: O(N)
  public int maximumSwapSubOptimal(int num) {
    char numArr[] = Integer.toString(num).toCharArray();
    int n = numArr.length;
    int maxRightIndex[] = new int[n];
    maxRightIndex[n - 1] = n - 1;
    for (int i = n - 2; i >= 0; i--) {
      maxRightIndex[i] = (numArr[i] > numArr[maxRightIndex[i + 1]])
        ? i
        : maxRightIndex[i + 1];
    }

    for (int i = 0; i < n; i++) {
      if (numArr[i] < numArr[maxRightIndex[i]]) {
        char temp = numArr[i];
        numArr[i] = numArr[maxRightIndex[i]];
        numArr[maxRightIndex[i]] = temp;
        return Integer.parseInt(new String(numArr));
      }
    }
    return num;
  }

  public int maximumSwapOptimal(int num) {
    char numStr[] = Integer.toString(num).toCharArray();
    int n = numStr.length;
    int maxDigitIdx = -1, swapIdx1 = -1, swapIdx2 = -1;
    for (int i = n - 1; i >= 0; i--) {
      if (maxDigitIdx == -1 || numStr[i] > numStr[maxDigitIdx]) {
        maxDigitIdx = i;
      } else if (numStr[i] < numStr[maxDigitIdx]) {
        swapIdx1 = i;
        swapIdx2 = maxDigitIdx;
      }
    }

    if (swapIdx1 != -1 && swapIdx2 != -1) {
      char temp = numStr[swapIdx1];
      numStr[swapIdx1] = numStr[swapIdx2];
      numStr[swapIdx2] = temp;
    }

    return Integer.parseInt(new String(numStr));
  }
}
