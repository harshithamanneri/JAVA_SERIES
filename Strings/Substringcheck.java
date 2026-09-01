package Strings;
public class Substringcheck {
    public static void main(String[] args) {
        String str = "Hello, welcome to the world of Java programming!";
        String substring = "Java";

        if (str.contains(substring)) {
            System.out.println("The string contains the substring: " + substring);
        } else {
            System.out.println("The string does not contain the substring: " + substring);
        }
    }
}