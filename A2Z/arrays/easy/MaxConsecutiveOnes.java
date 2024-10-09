public class MaxConsecutiveOnes {
  static int findMaxConsecutiveOnes(int arr[]) {
    int count = 0, max = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 1) count++;
      else count = 0;
      max = Math.max(count, max);
    }
    return max;
  }

  public static void main(String[] args) {
    int nums[] = { 1, 1, 0, 1, 1, 1 };
    int ans = findMaxConsecutiveOnes(nums);
    System.out.println("max number of consecutive 1s are " + ans);
  }
}
