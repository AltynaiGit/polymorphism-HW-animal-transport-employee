package org.example;

public class Main {
    static void main() {
        Transport[] Transport = {
                new Car(),
                new Bike(),
                new Plane()
        };

        for (Transport transport : Transport){
            transport.move();
            System.out.println(transport.speed());
        }
   }
}
