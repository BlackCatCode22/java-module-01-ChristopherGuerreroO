/**
 * A simple Java program that demonstrates the use of
 * primitive-type variables, arithmetic operations,
 * and string concatenation.
 */
public class VarsAndMath {

    public static void main(String[] args) {

        // Declare primitive-type variables
        int num1 = 10;
        int num2 = 5;
        double price = 15.99;
        char grade = 'A';
        boolean isPassed = true;

        // Perform simple arithmetic
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double division = (double) num1 / num2; // Type casting to get decimal result

        // String concatenation
        String message = "The sum of " + num1 + " and " + num2 + " is " + sum + ".";
        String mathDetails = "Product: " + product + ", Division: " + division;

        // Print results
        System.out.println(message);
        System.out.println("The difference is: " + difference);
        System.out.println(mathDetails);
        System.out.println("Item price: $" + price);
        System.out.println("Grade received: " + grade);
        System.out.println("Did the student pass? " + isPassed);
    }
}
