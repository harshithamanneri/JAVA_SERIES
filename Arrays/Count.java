import java.util.*;
public class Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        int count = 0;
        for (int num : array) {
            if (num > 0) {
                count++;
            }
        }
        
        System.out.println("The count of positive numbers in the array is: " + count);
    }
}
