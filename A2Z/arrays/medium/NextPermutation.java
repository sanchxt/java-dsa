import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextPermutation {
  // BRUTE FORCE APPROACH:
  // 1. generate all permutations in order
  // 2. do a linear search to find our input
  // 3. find it's next permutation if it exists, otherwise return the first permutation
  // TC: O(N! x N) , SC: O(1)

  // OPTIMAL APPROACH:
  // TC: O(3N) , SC: O(1)
  static List<Integer> nextPermutationOptimal(List<Integer> arr) {
    int n = arr.size();

    // find the breakpoint
    int index = -1;
    for (int i = n - 2; i >= 0; i--) {
      if (arr.get(i) < arr.get(i + 1)) {
        index = i;
        break;
      }
    }
    if (index == -1) {
      Collections.reverse(arr);
      return arr;
    }

    // find the next greater element & swap it
    for (int i = n - 1; i > index; i--) {
      if (arr.get(i) > arr.get(index)) {
        int temp = arr.get(i);
        arr.set(i, arr.get(index));
        arr.set(index, temp);
        break;
      }
    }

    // reverse the right half
    List<Integer> sublist = arr.subList(index + 1, n);
    Collections.reverse(sublist);
    return arr;
  }

  public static void main(String[] args) {
    List<Integer> arr = Arrays.asList(new Integer[] {2, 1, 5, 4, 3, 0, 0});
    List<Integer> ans = nextPermutationOptimal(arr);

    System.out.print("next permutation is: [ ");
    for (int i = 0; i < ans.size(); i++) {
        System.out.print(ans.get(i) + " ");
    }
    System.out.println("]");
}
}
