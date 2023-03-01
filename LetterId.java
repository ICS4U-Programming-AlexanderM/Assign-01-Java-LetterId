import java.util.Scanner;
/**
* This program determines if a letter is a vowel or a consonant.
*
* @author  Alexander Matheson
* @version 1.0
* @since   2023-03-01
*/

public final class LetterId {

    /**
    * For style checker.
    *
    * @exception IllegalStateException Utility class.
    * @see IllegalStateException
    */
    private LetterId() {
        throw new IllegalStateException("Utility class");
    }

    /**
    * Print messages.
    *
    * @param args Unused
    */
    public static void main(final String[] args) {
        // Array of all English letters in a specific order.
        // Y is first, followed by all other vowels.
        // The rest are consonants.
        final char[] letters = {'y', 'a', 'e', 'i', 'o', 'u', 'b', 'c', 'd',
            'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't',
            'v', 'w', 'x', 'z'};
        // Declare variables.
        int counter = 0;
        char userLetter = 'a';
        String stringInput = "";

        try {
            // Get input from user.
            final Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a letter: ");
            // Make string lower case.
            stringInput = scanner.next().toLowerCase();
            // Check length of entered string.
            if (stringInput.length() > 1) {
                System.out.println("Please enter a single letter.");
            } else {
                userLetter = stringInput.charAt(0);
                // Loop to check each letter in array
                while (letters[counter] != userLetter) {
                    counter++;
                }
                // Determine and display letter's id.
                if (counter == 0) {
                    System.out.print(Character.toUpperCase(userLetter));
                    System.out.println(" is both a consonant and a vowel.");
                } else if (counter < 6) {
                    System.out.print(Character.toUpperCase(userLetter));
                    System.out.println(" is a vowel.");
                } else {
                    System.out.print(Character.toUpperCase(userLetter));
                    System.out.println(" is a consonant.");
                }
            }
        } catch (ArrayIndexOutOfBoundsException err) {
            // Detects if loop tries to access array slot that does not exist.
            // Loop will only try to access array slot that does not exist if
            // no character in array matched input.
            System.out.println("Invalid input.");
        }
    }
}
