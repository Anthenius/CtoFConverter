import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter temperature in Celsius: ");
            if (scanner.hasNextDouble()) {
                celsius = scanner.nextDouble();
                validInput = true;
                double fahrenheit = convertCtoF(celsius);
                System.out.printf("Temperature in Fahrenheit: %.2f°F%n", fahrenheit);
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next(); // Clear the invalid input
            }
        }

        scanner.close();
    }

    private static double convertCtoF(double celsius) {
        return (celsius * 9/5) + 32;
    }
}
