public class MoveZerostoend {
    public static void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroFoundAt++] = nums[i];
            }
        }
        for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        System.out.println("Original array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        moveZeroes(nums);

        System.out.println("Array after moving zeroes to the end:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    
}
