import java.util.Scanner;

public class FuelCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gallons = 0.0;
        double milesPerGallon = 0.0;
        double pricePerGallon = 0.0;

        // Get the number of gallons in the tank
        do {
            System.out.print("Enter the number of gallons in the tank: ");
            if (scanner.hasNextDouble()) {
                gallons = scanner.nextDouble();
                if (gallons < 0) {
                    System.out.println("Please enter a non-negative value.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next(); // Clear the invalid input
            }
        } while (gallons < 0);

        // Get the fuel efficiency in miles per gallon
        do {
            System.out.print("Enter the fuel efficiency (miles per gallon): ");
            if (scanner.hasNextDouble()) {
                milesPerGallon = scanner.nextDouble();
                if (milesPerGallon <= 0) {
                    System.out.println("Please enter a positive value.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next(); // Clear the invalid input
            }
        } while (milesPerGallon <= 0);

        // Get the price of gas per gallon
        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (scanner.hasNextDouble()) {
                pricePerGallon = scanner.nextDouble();
                if (pricePerGallon < 0) {
                    System.out.println("Please enter a non-negative value.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next(); // Clear the invalid input
            }
        } while (pricePerGallon < 0);

        // Calculate cost to drive 100 miles and distance with full tank
        double costToDrive100Miles = (100.0 / milesPerGallon) * pricePerGallon;
        double distanceWithFullTank = gallons * milesPerGallon;

        // Print results
        System.out.printf("Cost to drive 100 miles: $%.2f%n", costToDrive100Miles);
        System.out.printf("Distance the car can go with a full tank: %.2f miles%n", distanceWithFullTank);

        scanner.close();
    }
}
