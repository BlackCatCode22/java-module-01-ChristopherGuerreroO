import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform arithmetic operations
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = (num2 != 0) ? (num1 / num2) : Double.NaN; // Prevent division by zero

        // Display the results with formatted output
        System.out.println("\nResults:");
        System.out.printf("Addition: %.2f + %.2f = %.2f%n", num1, num2, sum);
        System.out.printf("Subtraction: %.2f - %.2f = %.2f%n", num1, num2, difference);
        System.out.printf("Multiplication: %.2f * %.2f = %.2f%n", num1, num2, product);

        // Display division result only if the denominator is not zero
        if (num2 != 0) {
            System.out.printf("Division: %.2f / %.2f = %.2f%n", num1, num2, quotient);
        } else {
            System.out.println("Division: Cannot divide by zero.");
        }

        // Close the scanner
        scanner.close();
    }
}