import java.util.Scanner;

public class CharDetails {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a single character input
        System.out.print("Enter a single character: ");
        String input = scanner.next(); // Read input as a String

        // Ensure only a single character is processed
        if (input.length() != 1) {
            System.out.println("Error: Please enter exactly one character.");
        } else {
            char ch = input.charAt(0); // Extract the first character

            // Display the Unicode value of the character
            int unicodeValue = (int) ch;
            System.out.println("\nCharacter Details:");
            System.out.printf("Character: %c%n", ch);
            System.out.printf("Unicode Value: U+%04X%n", unicodeValue); // Unicode in hexadecimal format

            // Check if it's a letter or a digit
            if (Character.isLetter(ch)) {
                System.out.println("Type: Letter");
            } else if (Character.isDigit(ch)) {
                System.out.println("Type: Digit");
            } else {
                System.out.println("Type: Neither letter nor digit");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
