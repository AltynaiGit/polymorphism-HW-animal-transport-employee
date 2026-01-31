package org.example;

public class Plane extends Transport{
    @Override
    void move() {
        System.out.println("Самолёт летит");
    }

    @Override
    byte speed() {
        return 126;
    }
}
