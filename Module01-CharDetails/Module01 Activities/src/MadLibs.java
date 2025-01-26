import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for words
        System.out.println("Welcome to Mad Libs! Fill in the blanks to create your story.");

        System.out.print("Enter a noun: ");
        String noun = scanner.nextLine();

        System.out.print("Enter a verb: ");
        String verb = scanner.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = scanner.nextLine();

        System.out.print("Enter an adverb: ");
        String adverb = scanner.nextLine();

        System.out.print("Enter a place: ");
        String place = scanner.nextLine();

        // Create the Mad Libs story
        String story = "One day, a " + adjective + " " + noun + " was " + verb + " " + adverb +
                " in the middle of " + place + ". It was a day to remember!";

        // Display the generated story
        System.out.println("\nHere is your Mad Libs story:");
        System.out.println(story);

        // Close the scanner
        scanner.close();
    }
}
