import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
  // tc: O(N * M) , sc: O(N)
  static List<Integer> printSpiralMatrix(int arr[][]) {
    List<Integer> result = new ArrayList<>();
    int n = arr.length;
    int m = arr[0].length;
    int top = 0, left = 0;
    int bottom = n - 1, right = m - 1;

    while (top <= bottom && left <= right) {
      // left to right
      for (int i = left; i <= right; i++)
        result.add(arr[top][i]);
      top++;

      // top to bottom
      for (int i = top; i <= bottom; i++)
        result.add(arr[i][right]);
      right--;

      // right to left
      if (top <= bottom) {
        for (int i = right; i >= left; i--)
          result.add(arr[bottom][i]);
        bottom--;
      }

      // bottom to top
      if (left <= right) {
        for (int i = bottom; i >= top; i--)
          result.add(arr[i][left]);
        left++;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[][] mat = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
    List<Integer> ans = printSpiralMatrix(mat);
    for(int i = 0; i < ans.size(); i++){
        System.out.print(ans.get(i) + " ");
    }
    System.out.println();
  }
}
