import java.util.Scanner;  // Import Scanner for user input

/**
 * A simple Java program that asks the user for their favorite number
 * and prints it back along with a personalized message.
 */
public class FavoriteNumber {

    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their favorite number
        System.out.print("Enter your favorite number: ");

        // Read the number from user input
        int favoriteNumber = scanner.nextInt();

        // Print the favorite number back with a message
        System.out.println("Wow! " + favoriteNumber + " is a great choice for a favorite number!");

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
