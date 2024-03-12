// Main.java (Main class)
package com.example.project;

import com.example.project.util.Utility;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        Utility.doSomething();
    }
}
// Utility.java (Utility class)
package com.example.project.util;

public class Utility {
    public static void doSomething() {
        System.out.println("Doing something...");
    }
}
