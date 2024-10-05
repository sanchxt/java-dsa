package A2Z.basic_hashing;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
  static void displayMap(Map<Integer, Integer> map) {
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " - " + entry.getValue());
    }
  }

  static void displayFrequency(int arr[]) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
      if (map.containsKey(arr[i])) map.put(arr[i], map.get(arr[i]) + 1);
      else map.put(arr[i], 1);
    }
    displayMap(map);
  }

  public static void main(String[] args) {
    int arr[] = {10, 5, 10, 15, 10, 3, 5};
    displayFrequency(arr);
  }
}
