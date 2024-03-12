// Main.java (Main class)
package com.example.project;

import com.example.project.util.Utility;
import com.example.project.data.DataProcessor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to our Java project!");

        // Create an instance of Utility class
        Utility utility = new Utility();
        
        // Call methods from Utility class
        utility.doSomething();
        int result = utility.calculate(5, 3);
        System.out.println("Result of calculation: " + result);

        // Create an instance of DataProcessor class
        DataProcessor dataProcessor = new DataProcessor();
        String processedData = dataProcessor.process("input data");
        System.out.println("Processed data: " + processedData);
    }
}
// Utility.java (Utility class)
package com.example.project.util;

public class Utility {
    public void doSomething() {
        System.out.println("Utility class is doing something...");
    }
    
    public int calculate(int a, int b) {
        return a + b;
    }
}
