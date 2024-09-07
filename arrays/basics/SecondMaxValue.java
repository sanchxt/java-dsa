package arrays.basics;

public class SecondMaxValue {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int findSecondMax(int[] numbers) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                secondMax = max;
                max = numbers[i];
            } else if (numbers[i] > secondMax && numbers[i] != max) {
                secondMax = numbers[i];
            }
        }

        return secondMax;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 11, 5, 10, 7, 8};
        printArray(numbers);
        System.out.println(findSecondMax(numbers));
    }
}
