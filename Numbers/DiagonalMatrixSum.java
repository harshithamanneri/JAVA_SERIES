public class DiagonalMatrixSum {
    public static int sumDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i]; // Sum the elements on the main diagonal
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int diagonalSum = sumDiagonal(matrix);
        System.out.println("Sum of the diagonal elements: " + diagonalSum);
    }
    
}
