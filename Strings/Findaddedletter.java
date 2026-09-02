package Strings;

public class Findaddedletter {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "helloo";

        char addedLetter = findAddedLetter(str1, str2);
        if (addedLetter != '\0') {
            System.out.println("The added letter is: " + addedLetter);
        } else {
            System.out.println("No added letter found.");
        }
    }

    public static char findAddedLetter(String str1, String str2) {
        int[] count = new int[26]; // Assuming only lowercase letters

        for (char c : str1.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : str2.toCharArray()) {
            count[c - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] < 0) {
                return (char) (i + 'a');
            }
        }

        return '\0'; // No added letter found
    }
    
}
