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

        // Ask the user for the number of numbers to process
        System.out.print("How many numbers would you like to enter? ");
        int count = scanner.nextInt();

        // Process each number
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt();
            int sumOfDigits = sumOfDigits(number);
            boolean isArmstrong = isArmstrong(number);

            // Display results
            System.out.println("Number " + number + ":");
            System.out.println("  - Sum of digits: " + sumOfDigits);
            if (isArmstrong) {
                System.out.println("  - Armstrong number: Yes");
            } else {
                System.out.println("  - Armstrong number: No");
            }
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
