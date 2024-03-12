// Main.java (Main class)
package com.example.project;

import com.example.project.util.Utility;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to our Java project!");

        // Create an instance of Utility class
        Utility utility = new Utility();
        
        // Call methods from Utility class
        utility.doSomething();
        int result = utility.calculate(5, 3);
        System.out.println("Result of calculation: " + result);
    }
}
