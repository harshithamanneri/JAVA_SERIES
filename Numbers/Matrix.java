public class Matrix {
    public static void printMatrixPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Print the product of the row and column indices
                System.out.print((i * j) + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        int n = 5; // Size of the matrix pattern
        printMatrixPattern(n);
    }
    
}
