package com.kodilla.inheritance.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        circle.surfaceArea();
        circle.circuit();

        Square square = new Square(10);
        square.surfaceArea();
        square.circuit();

        Triangle equilateralTriangle = new Triangle(10, 8);
        equilateralTriangle.surfaceArea();
        equilateralTriangle.circuit();
    }
}
