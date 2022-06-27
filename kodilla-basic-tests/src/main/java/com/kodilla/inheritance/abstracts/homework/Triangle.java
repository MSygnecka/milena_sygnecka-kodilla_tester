package com.kodilla.inheritance.abstracts.homework;

public class Triangle extends Shape {
    int baseLength;
    int height;

    public Triangle(int baseLength, int height) {
        this.baseLength = baseLength;
        this.height = height;
    }
    @Override
    public double surfaceArea() {
        double surface = 0.5 * baseLength * height;
        System.out.println("The surface of the triangle is" + surface);
        return surface;
    }
    public double circuit() {
        double circuit = 3 * baseLength;
        System.out.println("The circuit of the triangle is" + circuit);
        return circuit;
    }
}
