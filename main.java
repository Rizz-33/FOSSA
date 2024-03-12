package com.example.project.animals;

public interface Animal {
    void makeSound();
}
package com.example.project.animals;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
package com.example.project.animals;
public class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
package com.example.project;
import com.example.project.animals.Animal;
import com.example.project.animals.Dog;
import com.example.project.animals.Cat;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to our Java project!");

        Animal dog = new Dog();
        Animal cat = new Cat();

        // Call makeSound() method
        dog.makeSound(); // Output: Woof!
        cat.makeSound(); // Output: Meow!
    }
}
