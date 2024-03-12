// MyJavaFile.java

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

        // Perform a simple calculation
        int x = 5;
        int y = 3;
        int sum = x + y;
        System.out.println("The sum of " + x + " and " + y + " is: " + sum);

        // Display a message based on the sum
        if (sum > 10) {
            System.out.println("That's a big number!");
        } else {
            System.out.println("That's not a very big number.");
        }

        // Farewell message
        System.out.println("Goodbye, " + name + "!");
    }
}
