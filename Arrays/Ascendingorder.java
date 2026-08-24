public class Ascendingorder {
    public static void sortAscending(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {3, 5, 1, 8, 2};
        sortAscending(numbers);
        System.out.print("Sorted array in ascending order: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}