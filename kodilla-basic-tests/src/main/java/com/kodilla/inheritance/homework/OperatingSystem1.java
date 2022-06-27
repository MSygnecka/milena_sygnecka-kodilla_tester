package com.kodilla.inheritance.homework;

public class OperatingSystem1 extends OperatingSystem {
    public OperatingSystem1 (int publishmentYear) {
        super (publishmentYear);
    }
    @Override
    public void turnOn() {
        System.out.println("System1 is turned on");
    }
    @Override
    public void turnOff() {
        System.out.println("System1 is turned off");
    }


}
