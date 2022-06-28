package com.kodilla.inheritance.homework;

public class OperatingSystem {
    int publishmentYear;
    public void turnOn() {
        System.out.println("System is turned on");
    }
    public void turnOff() {
        System.out.println("System is turned off");
    }
    public OperatingSystem (int publishmentYear) {
        this.publishmentYear = publishmentYear;

    }
}
