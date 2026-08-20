public class Binary {
    public static void printBinaryPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Print 1 if the sum of indices is even, else print 0
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        int n = 5; // Size of the binary pattern
        printBinaryPattern(n);
    }
    
}
