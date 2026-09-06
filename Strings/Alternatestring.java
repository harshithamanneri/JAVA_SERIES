package Strings;

public class Alternatestring {
    public static void main(String[] args) {
        String str = "HelloWorld";
        StringBuilder evenChars = new StringBuilder();
        StringBuilder oddChars = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                evenChars.append(str.charAt(i));
            } else {
                oddChars.append(str.charAt(i));
            }
        }

        System.out.println("Even indexed characters: " + evenChars.toString());
        System.out.println("Odd indexed characters: " + oddChars.toString());
    }
    
}
