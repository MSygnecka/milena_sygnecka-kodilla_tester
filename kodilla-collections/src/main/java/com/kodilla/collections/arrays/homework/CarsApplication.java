package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Volvo;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
       Car[] cars = new Car[15];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }
    public static Car drawCar() {
        Random random = new Random();
        int drawCar = random.nextInt(3);
        int speed = 0;
        int increaseSpeed = getRandomSize(random);
        if (drawCar == 0)
            return new Ford(speed + increaseSpeed);
        else if (drawCar == 1)
            return new Opel(speed + increaseSpeed);
        else {
            return new Volvo(speed + increaseSpeed);
        }
    }

    private static int getRandomSize(Random random) {
        return random.nextInt(100);
    }
}
