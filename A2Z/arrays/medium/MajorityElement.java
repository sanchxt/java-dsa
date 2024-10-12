import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
  // tc: O(N^2) , sc: O(1)
  static int majorityElementBruteForce(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      int count = 0;
      for (int j = 0; j < n; j++) {
        if (arr[j] == arr[i]) count++;
      }
      if (count > (n / 2)) return arr[i];
    }
    return -1;
  }

  // tc: O(N * logN) + O(N) , sc: O(N)
  static int majorityElementBetterApproach(int arr[]) {
    int n = arr.length;
    HashMap<Integer, Integer> mpp = new HashMap<>();
    for (int i = 0; i < n; i++) {
      int val = mpp.getOrDefault(arr[i], 0);
      mpp.put(arr[i], val + 1);
    }
    for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
      if (it.getValue() > (n / 2)) return it.getKey();
    }
    return -1;
  }

  // MOORE'S VOTING ALGO
  // tc: O(N) + O(N) , sc: O(1)
  static int majorityElementOptimal(int arr[]) {
    int n = arr.length;
    int count = 0, elem = 0;
    for (int i = 0; i < n; i++) {
      if (count == 0) {
        count = 1;
        elem = arr[i];
      } else if (elem == arr[i]) count++;
      else count--;
    }

    // if the question states that the array WILL contain a majority element,
    // we do NOT need this second check
    // in which case, the tc will be O(N)
    int count1 = 0;
    for (int i = 0; i < n; i++) {
      if (arr[i] == elem) count1++;
    }

    if (count1 > (n / 2)) return elem;
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = {2, 2, 1, 1, 1, 2, 2};
    int ans = majorityElementOptimal(arr);
    System.out.println("The majority element is: " + ans);
  }
}
