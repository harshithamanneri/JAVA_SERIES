package Strings;

public class Correctword {
    public static void main(String[] args) {
        String str = "HelloWorld";
        StringBuilder correctedStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                correctedStr.append(ch);
            }
        }

        System.out.println("Corrected string: " + correctedStr.toString());
    }
    
}
