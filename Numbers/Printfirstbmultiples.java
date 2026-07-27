import java.util.*;
public class Printfirstbmultiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter the count of multiples to print: ");
        int count = sc.nextInt();
        
        System.out.println("The first " + count + " multiples of " + num + " are:");
        for (int i = 1; i <= count; i++) {
            System.out.println(num * i);
        }
    }
}