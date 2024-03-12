// Animal.java (Interface)
package com.example.project.animals;

public interface Animal {
    void makeSound();
}

// Dog.java (Dog class implementing the Animal interface)
package com.example.project.animals;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

// Cat.java (Cat class implementing the Animal interface)
package com.example.project.animals;

public class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
// Main.java (Main class)
package com.example.project;

import com.example.project.animals.Animal;
import com.example.project.animals.Dog;
import com.example.project.animals.Cat;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to our Java project!");

        // Create instances of Dog and Cat
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Call makeSound() method
        dog.makeSound(); // Output: Woof!
        cat.makeSound(); // Output: Meow!
    }
}
