package org.example;

public class Dog extends Animal{
    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    String makeSound() {
        return name;
    }
}
