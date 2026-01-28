package org.example;

public class Main {
    static void main() {
        Shape[] Shape = new Shape[]{
                new Circle(5),
                new Rectangle(4, 6),
                new Triangle(3, 8)
        };

        for (Shape shape : Shape){
            System.out.println("Площадь: " + shape.getArea());
        }
    }
}
