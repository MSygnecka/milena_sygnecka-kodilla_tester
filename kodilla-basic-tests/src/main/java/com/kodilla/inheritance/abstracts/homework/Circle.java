package com.kodilla.inheritance.abstracts.homework;

import static java.lang.Math.PI;

public class Circle extends Shape{
    int circleRadius;

    public Circle(int circleRadius) {
        this.circleRadius = circleRadius;
    }
    @Override
    public double surfaceArea() {
        double power = Math.pow(circleRadius, 2);
        double surface = PI * power;
        System.out.println("The surface of the circle is" + surface);
        return surface;
    }
    public double circuit() {
        double circuit = 2 * PI *circleRadius;
        System.out.println ("The circuit of the circle is" + circuit);
        return circuit;
    }
}
