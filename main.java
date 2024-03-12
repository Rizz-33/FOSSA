import java.util.Scanner;

public class SimpleJavaProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to My Simple Java Program!");

        // Ask the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Greet the user
        System.out.println("Hello, " + name + "!");

        boolean repeat = true;
        while (repeat) {
            // Calculate the sum of digits in a number
            System.out.print("Enter a positive integer to calculate the sum of its digits: ");
            int number;
            try {
                number = Integer.parseInt(scanner.nextLine());
                if (number <= 0) {
                    System.out.println("Please enter a positive integer.");
                    continue; // Repeat the loop
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid positive integer.");
                continue; // Repeat the loop
            }

            int sumOfDigits = 0;
            int tempNumber = number;
            while (tempNumber != 0) {
                sumOfDigits += tempNumber % 10;
                tempNumber /= 10;
            }
            System.out.println("The sum of digits in " + number + " is: " + sumOfDigits);

            // Ask if the user wants to repeat the calculation
            System.out.print("Do you want to calculate again? (yes/no): ");
            String repeatChoice = scanner.nextLine().toLowerCase();
            repeat = repeatChoice.equals("yes");
        }

        // Farewell message
        System.out.println("Thank you for using My Simple Java Program, " + name + "!");
        scanner.close();
    }
}
