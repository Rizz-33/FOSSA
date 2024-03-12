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
