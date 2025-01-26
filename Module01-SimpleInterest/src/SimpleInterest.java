import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for inputs
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (as a percentage): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time in years: ");
        double time = scanner.nextDouble();

        // Calculate simple interest using the formula: SI = (P * R * T) / 100
        double simpleInterest = (principal * rate * time) / 100;

        // Display the result with formatted output
        System.out.printf("\nThe simple interest for a principal of $%.2f at an interest rate of %.2f%% for %.1f years is: $%.2f%n",
                principal, rate, time, simpleInterest);

        // Close the scanner
        scanner.close();
    }
}
