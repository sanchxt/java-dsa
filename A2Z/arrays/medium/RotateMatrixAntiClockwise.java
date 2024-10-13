public class RotateMatrixAntiClockwise {
  // tc: O(N * N), sc: O(N * N)
  static int[][] rotateAntiClockwiseBrute(int arr[][]) {
    int n = arr.length;
    int temp[][] = new int[n][n];
    int index = n - 1;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        temp[i][j] = arr[j][index];
      }
      index--;
    }
    return temp;
  }

  // tc: O(N ^ 2) , sc: O(1)
  static int[][] rotateAntiClockwiseOptimal(int arr[][]) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
      }
    }

    for (int i = 0; i < n; i++) {
      int index = n - 1;
      for (int j = 0; j < n / 2; j++) {
        int temp = arr[j][i];
        arr[j][i] = arr[index][i];
        arr[index][i] = temp;
        index--;
      }
    }
    return arr;
  }

  public static void main(String[] args) {
    int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int rotated[][] = rotateAntiClockwiseBrute(matrix);
    for (int i = 0; i < rotated.length; i++) {
      for (int j = 0; j < rotated.length; j++) {
        System.out.print(rotated[i][j] + " ");
      }
      System.out.println();
    }
  }
}
