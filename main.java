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

        // Calculate the factorial of a number
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();
        long factorial = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is: " + factorial);

        // Check if the number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Farewell message
        System.out.println("Goodbye, " + name + "!");
    }

    // Method to calculate the factorial of a number
    private static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // Method to check if a number is prime
    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
