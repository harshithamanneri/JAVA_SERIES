import java.util.Scanner;
public class MissingElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int missingElement = findMissingElement(arr, n);
        if (missingElement != -1) {
            System.out.println("The missing element is: " + missingElement);
        } else {
            System.out.println("No missing element found.");
        }
    }

    public static int findMissingElement(int[] arr, int n) {
        boolean[] present = new boolean[n + 1];
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 1 && arr[i] <= n) {
                present[arr[i]] = true;
            }
        }
        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                return i;
            }
        }
        return -1; // No missing element
    }
    
}
