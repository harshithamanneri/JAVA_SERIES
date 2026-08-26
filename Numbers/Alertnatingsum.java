public class Alertnatingsum {
    public static int alternatingSum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sum += arr[i]; // Add even indexed elements
            } else {
                sum -= arr[i]; // Subtract odd indexed elements
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int result = alternatingSum(arr);
        System.out.println("The alternating sum is: " + result);
    }
    
}
