import java.util.Scanner;

public class MyJavaFile {
    public static void main(String[] args) {
        System.out.println("Welcome to My Advanced Java File!");

        Scanner scanner = new Scanner(System.in);

        // Ask the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Greet the user
        System.out.println("Hello, " + name + "!");

        // Display menu options
        System.out.println("Select an option:");
        System.out.println("1. Calculate sum of digits");
        System.out.println("2. Check if number is Armstrong");
        System.out.println("3. Calculate factorial");
        System.out.println("4. Check if number is palindrome");

        // Get user's choice
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Calculate the sum of digits in a number
                System.out.print("Enter a number to calculate the sum of its digits: ");
                int number1 = scanner.nextInt();
                int sumOfDigits = sumOfDigits(number1);
                System.out.println("The sum of digits in " + number1 + " is: " + sumOfDigits);
                break;
            case 2:
                // Check if the number is Armstrong
                System.out.print("Enter a number to check if it's Armstrong: ");
                int number2 = scanner.nextInt();
                if (isArmstrong(number2)) {
                    System.out.println(number2 + " is an Armstrong number.");
                } else {
                    System.out.println(number2 + " is not an Armstrong number.");
                }
                break;
            case 3:
                // Calculate factorial of a number
                System.out.print("Enter a number to calculate its factorial: ");
                int number3 = scanner.nextInt();
                long factorial = calculateFactorial(number3);
                System.out.println("The factorial of " + number3 + " is: " + factorial);
                break;
            case 4:
                // Check if the number is a palindrome
                System.out.print("Enter a number to check if it's a palindrome: ");
                int number4 = scanner.nextInt();
                if (isPalindrome(number4)) {
                    System.out.println(number4 + " is a palindrome.");
                } else {
                    System.out.println(number4 + " is not a palindrome.");
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }

        // Farewell message
        System.out.println("Goodbye, " + name + "!");
        scanner.close();
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

    // Method to calculate factorial of a number
    private static long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // Method to check if a number is palindrome
    private static boolean isPalindrome(int n) {
        int reversed = 0, original = n;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return original == reversed;
    }
}
