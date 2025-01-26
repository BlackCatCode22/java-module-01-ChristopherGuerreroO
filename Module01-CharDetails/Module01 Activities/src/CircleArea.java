import java.util.Scanner;  // Import Scanner for user input

/**
 * A simple Java program that calculates the area of a circle
 * based on the user-provided radius.
 */
public class CircleArea {

    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the radius
        System.out.print("Enter the radius of the circle: ");

        // Read the radius as a double
        double radius = scanner.nextDouble();

        // Calculate the area using the formula: Area = π * r²
        double area = Math.PI * Math.pow(radius, 2);

        // Display the result with two decimal places
        System.out.printf("The area of the circle with radius %.2f is %.2f%n", radius, area);

        // Close the scanner
        scanner.close();
    }
}
