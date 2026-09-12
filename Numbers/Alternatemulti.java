public class Alternatemulti {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        int num3 = 4;

        int product = 1;

        if (num1 % 2 == 0) {
            product *= num1;
        }

        if (num2 % 2 == 0) {
            product *= num2;
        }

        if (num3 % 2 == 0) {
            product *= num3;
        }

        System.out.println("The product of even numbers is: " + product);
    }
    
}
