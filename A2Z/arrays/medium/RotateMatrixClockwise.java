public class RotateMatrixClockwise {
  // tc: O(N ^ 2) , sc: O(N ^ 2)
  static int[][] rotateClockwiseBrute(int arr[][]) {
    int n = arr.length;
    int rotated[][] = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        rotated[j][n - i - 1] = arr[i][j];
      }
    }
    return rotated;
  }

  // tc: O(N ^ 2) , sc: O(1)
  static int[][] rotateClockwiseOptimal(int arr[][]) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      for (int j = i; j < n; j++) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n / 2; j++) {
        int temp = arr[i][j];
        arr[i][j] = arr[i][n - 1 - j];
        arr[i][n - 1 - j] = temp;
      }
    }
    return arr;
  }

  public static void main(String[] args) {
    int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int rotated[][] = rotateClockwiseOptimal(arr);
    System.out.println("rotated matrix:");
    for (int i = 0; i < rotated.length; i++) {
      for (int j = 0; j < rotated.length; j++) {
        System.out.print(rotated[i][j] + " ");
      }
      System.out.println();
    }
  }
}
