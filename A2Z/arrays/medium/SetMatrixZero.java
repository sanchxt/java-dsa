public class SetMatrixZero {
  static void markRow(int arr[][], int n, int m, int i) {
    for (int j = 0; j < m; j++) {
      if (arr[i][j] != 0) arr[i][j] = -1;
    }
  }

  static void markCol(int arr[][], int n, int m, int j) {
    for (int i = 0; i < n; i++) {
      if (arr[i][j] != 0) arr[i][j] = -1;
    }
  }

  // tc: O((N * M) + (N + M)) + O(N * M), approximately equal to O(N^3)
  // sc: O(1)
  static int[][] zeroMatrixBrute(int arr[][], int n, int m) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (arr[i][j] == 0) {
          markRow(arr, n, m, i);
          markCol(arr, n, m, j);
        }
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (arr[i][j] == -1) arr[i][j] = 0;
      }
    }
    return arr;
  }

  // tc: O(2 * (N * M))
  // sc: O(N) + O(M)
  static int[][] zeroMatrixBetterApproach(int arr[][], int n, int m) {
    int row[] = new int[n];
    int col[] = new int[m];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (arr[i][j] == 0) {
          row[i] = 1;
          col[j] = 1;
        }
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (row[i] == 1 || col[j] == 1) {
          arr[i][j] = 0;
        }
      }
    }
    return arr;
  }

  // tc: O(2 * (N * M))
  // sc: O(1)
  static int[][] zeroMatrixOptimal(int arr[][], int n, int m) {
    int col0 = 1;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (arr[i][j] == 0) {
          arr[i][0] = 0;
          if (j != 0) arr[0][j] = 0;
          else col0 = 0;
        }
      }
    }

    for (int i = 1; i < n; i++) {
      for (int j = 1; j < m; j++) {
        if (arr[i][j] != 0) {
          if (arr[i][0] == 0 || arr[0][j] == 0) arr[i][j] = 0;
        }
      }
    }

    if (arr[0][0] == 0) {
      for (int j = 0; j < m; j++) arr[0][j]  = 0;
    }
    if (col0 == 0) {
      for (int i = 0; i < n; i++) arr[i][0] = 0;
    }
    return arr;
  }

  public static void main(String[] args) {
    int matrix[][] = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
    int n = matrix.length;
    int m = matrix[0].length;

    int resultMatrix[][] = zeroMatrixOptimal(matrix, n, m);
    System.out.println("final matrix: ");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(resultMatrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
