public class Nthfibanoicnumber {
    public static int nthFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer");
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        int n = 10; // Example input
        int result = nthFibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }
    
}
