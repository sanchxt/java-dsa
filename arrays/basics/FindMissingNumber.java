public class FindMissingNumber {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1; // because the actual array is missing a number
        int sum = (n * (n + 1)) / 2;
        for (int num : arr) {
            sum = sum - num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 8, 2, 4, 7};
        System.out.println(findMissingNumber(arr));
    }
}
