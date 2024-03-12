import java.util.Scanner;

public class MyJavaFile {
    public static void main(String[] args) {
        System.out.println("Welcome to My Java File!");

        // Ask the user for their name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Greet the user
        System.out.println("Hello, " + name + "!");

        // Calculate the sum of digits in a number
        System.out.print("Enter a number to calculate the sum of its digits: ");
        int number = scanner.nextInt();
        int sumOfDigits = sumOfDigits(number);
        System.out.println("The sum of digits in " + number + " is: " + sumOfDigits);

        // Check if the number is Armstrong
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        // Farewell message
        System.out.println("Goodbye, " + name + "!");
    }

    // Method to calculate the sum of digits in a number
    private static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // Method to check if a number is Armstrong
    private static boolean isArmstrong(int n) {
        int originalNumber = n;
        int digits = String.valueOf(n).length();
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        return sum == originalNumber;
    }
}
