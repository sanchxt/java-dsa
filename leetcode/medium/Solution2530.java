import java.util.PriorityQueue;

public class Solution2530 {
  public long maxKelements(int[] nums, int k) {
    PriorityQueue<Integer> pqueue = new PriorityQueue<>((a, b) -> b - a);
    for (int num : nums) pqueue.add(num);
    long maxSum = 0;
    while (k > 0) {
      int max = pqueue.poll();
      maxSum += max;
      pqueue.add((max + 2) / 3);
      k--;
    }
    return maxSum;
  }
}
