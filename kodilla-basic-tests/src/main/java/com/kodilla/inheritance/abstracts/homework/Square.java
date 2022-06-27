package com.kodilla.inheritance.abstracts.homework;

import static java.lang.Math.PI;

public class Square extends Shape {
    int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }
    @Override
    public double surfaceArea() {
        double surface = Math.pow(sideLength, 2);
        System.out.println("The surface of the square is" + surface);
        return surface;
    }
    public double circuit() {
        double circuit = 4 * sideLength;
        System.out.println("The circuit of the square is" + circuit);
        return circuit;
    }
}
