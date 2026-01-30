package org.example;

public class Cat extends Animal{
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    String makeSound() {
        return name;
    }
}
