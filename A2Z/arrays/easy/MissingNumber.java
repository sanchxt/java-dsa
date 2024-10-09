public class MissingNumber {
  static int missingNumber(int arr[], int n) {
    int actualSum = (n * (n + 1)) / 2;
    int arrSum = 0;
    for (int i = 0; i < n - 1; i++) {
      arrSum += arr[i];
    }
    return actualSum - arrSum;
  }

  // XOR of two same numbers is always 0 i.e. a ^ a = 0. ← Property 1.
  // XOR of a number with 0 will result in the number itself i.e. 0 ^ a = a.  ← Property 2
  static int missingNumber2(int arr[]) {
    int n = arr.length;
    int xor = 0;
    for (int i = 0; i < n; i++) {
        xor = xor ^ i ^ arr[i];
    }
    return xor ^ n;
  }

  public static void main(String[] args) {
    // int n = 5; // (for missingNumber())
    int arr[] = {1, 0, 2, 4, 5};

    int ans = missingNumber2(arr);
    System.out.println("The missing number is: " + ans);
  }
}
