package com.kodilla.inheritance.homework;

public class OperatingSystem2 extends OperatingSystem {

    public OperatingSystem2 (int publishmentYear) {
        super (publishmentYear);
    }
    @Override
    public void turnOn() {
        System.out.println("System2 is turned on");
    }
    @Override
    public void turnOff() {
        System.out.println("System2 is turned off");
    }
}
