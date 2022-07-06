package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Volvo;


public class CarUtils {
    public static void describeCar(Car car) {
        if (car instanceof Ford)
            System.out.println("Ford");
        else if (car instanceof Opel)
            System.out.println("Opel");
        else if (car instanceof Volvo)
            System.out.println("Volvo");
        else
            System.out.println("Unknown type of car");

        System.out.println("Car increase speed: " + car.getSpeed());
    }

}
