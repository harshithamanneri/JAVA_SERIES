public class Checkerboard {
    public static void main(String[] args) {
        int size = 8; // Size of the checkerboard
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("X "); // Black square
                } else {
                    System.out.print("O "); // White square
                }
            }
            System.out.println();
        }
    }
    
}
