package org.example;

public class Car extends Transport{
    @Override
    void move() {
        System.out.println("Машина едет");
    }

    @Override
    byte speed() {
        return 40;
    }
}
