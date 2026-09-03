public class Continuousalphabet_triangle {
    public static void main(String[] args) {
        int n = 5; // Number of rows for the triangle

        for (int i = 1; i <= n; i++) {
            char ch = 'A'; // Starting character for each row
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++; // Move to the next character
            }
            System.out.println(); // Move to the next line after each row
        }
    }
    
}
