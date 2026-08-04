public class Multiplicationtable {
    public static void main(String[] args) {
        int number = 5; // You can change this number to generate a multiplication table for a different number
        System.out.println("Multiplication Table of " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}