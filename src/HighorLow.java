import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1; // Generate random number between 1 and 10
        int userGuess = 0;

        // Get user guess with validation
        do {
            System.out.print("Guess a number between 1 and 10: ");
            if (scanner.hasNextInt()) {
                userGuess = scanner.nextInt();
                if (userGuess < 1 || userGuess > 10) {
                    System.out.println("Please enter a number between 1 and 10.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Clear the invalid input
            }
        } while (userGuess < 1 || userGuess > 10);

        // Display the random number and user's guess result
        System.out.println("The random number is: " + randomNumber);
        if (userGuess < randomNumber) {
            System.out.println("Your guess is too low!");
        } else if (userGuess > randomNumber) {
            System.out.println("Your guess is too high!");
        } else {
            System.out.println("Congratulations! Your guess is correct!");
        }

        scanner.close();
    }
}
