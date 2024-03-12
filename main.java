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

        // Calculate the sum of digits in a number
        System.out.print("Enter a number to calculate the sum of its digits: ");
        int number = scanner.nextInt();
        int sumOfDigits = 0;
        int tempNumber = number;
        while (tempNumber != 0) {
            sumOfDigits += tempNumber % 10;
            tempNumber /= 10;
        }
        System.out.println("The sum of digits in " + number + " is: " + sumOfDigits);

        // Farewell message
        System.out.println("Goodbye, " + name + "!");
        scanner.close();
    }
}
