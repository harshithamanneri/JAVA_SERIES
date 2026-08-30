public class Calculatepower {
    public static double calculatePower(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        double base = 2.0; // Example base
        double exponent = 3.0; // Example exponent
        double result = calculatePower(base, exponent);
        System.out.println(result); // Output: 8.0
    }
    
}
