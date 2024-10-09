import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = 0.0;
        double height = 0.0;

        // Get the width of the rectangle
        do {
            System.out.print("Enter the width of the rectangle: ");
            if (scanner.hasNextDouble()) {
                width = scanner.nextDouble();
                if (width <= 0) {
                    System.out.println("Please enter a positive value.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next(); // Clear the invalid input
            }
        } while (width <= 0);

        // Get the height of the rectangle
        do {
            System.out.print("Enter the height of the rectangle: ");
            if (scanner.hasNextDouble()) {
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("Please enter a positive value.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next(); // Clear the invalid input
            }
        } while (height <= 0);

        // Calculate area, perimeter, and diagonal
        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt((width * width) + (height * height));

        // Print results
        System.out.printf("Area of the rectangle: %.2f%n", area);
        System.out.printf("Perimeter of the rectangle: %.2f%n", perimeter);
        System.out.printf("Length of the diagonal: %.2f%n", diagonal);

        scanner.close();
    }
}
