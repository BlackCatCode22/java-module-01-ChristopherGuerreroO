import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius using the formula: C = (F - 32) * 5/9
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;

        // Display the result with formatted output
        System.out.printf("The equivalent temperature in Celsius is: %.2f°C%n", celsius);

        // Close the scanner
        scanner.close();
    }
}
