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

        // Calculate the Fibonacci sequence
        System.out.print("Enter the number of Fibonacci numbers to generate: ");
        int count = scanner.nextInt();
        System.out.println("The Fibonacci sequence:");
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();

        // Reverse a string
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter a string to reverse: ");
        String inputString = scanner.nextLine();
        String reversedString = reverseString(inputString);
        System.out.println("Reversed string: " + reversedString);

        // Farewell message
        System.out.println("Goodbye, " + name + "!");
    }

    // Method to calculate the Fibonacci number at a given index
    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Method to reverse a string
    private static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
