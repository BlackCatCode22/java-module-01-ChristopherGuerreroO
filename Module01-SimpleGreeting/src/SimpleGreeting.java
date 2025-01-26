import java.util.Scanner;  // Import the Scanner class for user input

/**
 * A simple Java program that asks the user for their name
 * and prints a personalized greeting.
 */
public class SimpleGreeting {

    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask for the user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Read user input

        // Print a personalized greeting
        System.out.println("Hello, " + name + "! Welcome to Java programming.");

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
