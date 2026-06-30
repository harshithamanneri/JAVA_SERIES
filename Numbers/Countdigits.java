import java.util.Scanner;
public class Countdigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         int count = 0;
         int n=sc.nextInt();
         while(n>0){
              int digit=n%10;
              count++;
              n/=10;
         }
         System.out.println("Number of digits: " + count);
    }

    
}
