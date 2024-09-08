public class ResizeAnArray {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int[] resizeArray(int[] arr, int newSize) {
        int[] temp = new int[newSize];
        for (int i = 0; i < newSize; i++) {
            if (i < arr.length) {
                temp[i] = arr[i];
            } else {
                temp[i] = 0;
            }
        }
        arr = temp;
        return arr;
    }

    public static void main(String[] args) {
        ResizeAnArray arrUtil = new ResizeAnArray();
        int[] originalArr = new int[] {5, 1, 2, 9, 10};
        System.out.println("Size of original array: " + originalArr.length);

        originalArr = arrUtil.resizeArray(originalArr, 10);
        System.out.println("Size of original array after resizing: " + originalArr.length);
        printArray(originalArr);
    }
}
