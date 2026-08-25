package Strings;

public class MissingLetter {
    public static char findMissingLetter(char[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] - array[i] != 1) {
                return (char) (array[i] + 1);
            }
        }
        throw new IllegalArgumentException("No missing letter found in the array");
    }

    public static void main(String[] args) {
        char[] letters = {'a', 'b', 'c', 'e'};
        char missingLetter = findMissingLetter(letters);
        System.out.println("The missing letter is: " + missingLetter);
    }
    
}
