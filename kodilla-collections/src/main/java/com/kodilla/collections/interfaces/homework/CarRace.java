package com.kodilla.collections.interfaces.homework;

import java.util.concurrent.Callable;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford (20);
        doRace(ford);

        Opel opel = new Opel(30);
        doRace(opel);

        Volvo volvo = new Volvo(50);
        doRace(volvo);
    }
    public static void doRace (Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();

        System.out.println(car.getSpeed());
    }

}
