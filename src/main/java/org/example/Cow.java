package org.example;

public class Cow extends Animal{
    String name;

    public Cow(String name) {
        this.name = name;
    }

    @Override
    String makeSound() {
        return name;
    }
}
