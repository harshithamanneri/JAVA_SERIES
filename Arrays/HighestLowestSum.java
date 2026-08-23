public class HighestLowestSum {
    public static int sumHighestLowest(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int highest = arr[0];
        int lowest = arr[0];

        for (int num : arr) {
            if (num > highest) {
                highest = num;
            }
            if (num < lowest) {
                lowest = num;
            }
        }

        return highest + lowest;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 5, 1, 8, 2};
        int sum = sumHighestLowest(numbers);
        System.out.println("Sum of the highest and lowest numbers: " + sum);
    }
}