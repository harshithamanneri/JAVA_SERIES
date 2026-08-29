public class Togglecase {
    public static String toggleCase(String input) {
        StringBuilder toggled = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                toggled.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                toggled.append(Character.toUpperCase(c));
            } else {
                toggled.append(c);
            }
        }
        return toggled.toString();
    }

    public static void main(String[] args) {
        String input = "Hello World!"; // Example input
        String result = toggleCase(input);
        System.out.println(result); // Output: hELLO wORLD!
    }
    
}
