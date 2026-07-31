import java.util.*;
public class MaximumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first element: ");
        int n = scanner.nextInt();
        System.out.print("Enter the second element: ");
        int m = scanner.nextInt();
        System.out.println(Math.max(n, m));
    }
}