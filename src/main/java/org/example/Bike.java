package org.example;

public class Bike extends Transport{

    @Override
    void move() {
        System.out.println("Велосипед едет");
    }

    @Override
    byte speed() {
        return 25;
    }
}
