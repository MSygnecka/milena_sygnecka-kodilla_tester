package com.kodilla.inheritance.homework;

public class Operating {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2020);
        operatingSystem.turnOn();

        OperatingSystem operatingSystem1 = new OperatingSystem1(2021);
        operatingSystem1.turnOn();


        OperatingSystem operatingSystem2 = new OperatingSystem2(2022);
        operatingSystem2.turnOn();
    }
}

