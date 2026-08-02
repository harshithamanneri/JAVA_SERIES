public class Xor {
    public static void main(String[] args) {
        int a = 5; // binary: 0101
        int b = 3; // binary: 0011
        int result = a ^ b; // binary: 0110, which is 6 in decimal
        System.out.println("The result of " + a + " XOR " + b + " is: " + result);
    }
}