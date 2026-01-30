package org.example;

public class Main {
    static void main() {

        Animal[] Animal = new Animal[]{
                new Cow("Cow: Mu mu mu"),
                new Dog("Dog: Gav gav gav"),
                new Cat("Cat: Meow meow")
        };

        for (Animal animal : Animal){
            System.out.println(animal.makeSound());
        }
    }
}