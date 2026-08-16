package Strings;

public class Validpalindrome {
    public static boolean isPalindrome(String str) {
        // Remove whitespace and convert to lowercase
        str = str.replaceAll("\\s", "").toLowerCase();

        // Initialize pointers for the start and end of the string
        int left = 0;
        int right = str.length() - 1;

        // Check characters from both ends towards the center
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Not a palindrome
            }
            left++;
            right--;
        }

        return true; // Is a palindrome
    }

    public static void main(String[] args) {
        String str = "A man a plan a canal Panama";
    
    if (isPalindrome(str)) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }       
    }}