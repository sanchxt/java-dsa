package A2Z.basic_hashing;

import java.util.HashMap;
import java.util.Map;

public class LowHighFreq {
  static void checkFrequency(Map<Integer, Integer> map, int n) {
    int maxFreq = 0, minFreq = n;
    int maxEle = 0, minEle = 0;
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      int count = entry.getValue();
      int element = entry.getKey();

      if (count > maxFreq) {
        maxEle = element;
        maxFreq = count;
      }
      if (count < minFreq) {
        minEle = element;
        minFreq = count;
      }
    }

    System.out.println("The highest frequency element is " + maxEle + " with frequency: " + maxFreq);
    System.out.println("The lowest frequency element is " + minEle + " with frequency: " + minFreq);
  }

  static void displayFrequency(int arr[]) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
      if (map.containsKey(arr[i])) map.put(arr[i], map.get(arr[i]) + 1);
      else map.put(arr[i], 1);
    }
    checkFrequency(map, arr.length);
  }

  public static void main(String[] args) {
    int arr[] = {10, 5, 10, 15, 10, 3, 5};
    displayFrequency(arr);
  }
}
