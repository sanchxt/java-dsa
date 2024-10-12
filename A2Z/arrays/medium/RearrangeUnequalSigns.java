import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeUnequalSigns {
  static ArrayList<Integer> rearrangeBySigns(ArrayList<Integer> arr, int n) {
    ArrayList<Integer> pos = new ArrayList<>();
    ArrayList<Integer> neg = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      if (arr.get(i) > 0) pos.add(arr.get(i));
      else neg.add(arr.get(i));
    }

    if (pos.size() < neg.size()) {
      for (int i = 0; i < pos.size(); i++) {
        arr.set(2 * i, pos.get(i));
        arr.set(2 * i + 1, neg.get(i));
      }

      int index = pos.size() * 2;
      for (int i = pos.size(); i < neg.size(); i++) {
        arr.set(index, neg.get(i));
        index++;
      }
    } else {
      for (int i = 0; i < neg.size(); i++) {
        arr.set(2 * i, pos.get(i));
        arr.set(2 * i + 1, neg.get(i));
      }

      int index = neg.size() * 2;
      for (int i = neg.size(); i < pos.size(); i++) {
        arr.set(index, pos.get(i));
        index++;
      }
    }
    return arr;
  }

  public static void main(String[] args) {
    ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, -4, -5, 3, 4));
    int n = A.size();

    ArrayList<Integer> ans = rearrangeBySigns(A, n);

    for (int i = 0; i < ans.size(); i++) {
      System.out.print(ans.get(i) + " ");
    }
  }
}
