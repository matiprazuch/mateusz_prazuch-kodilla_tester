package com.kodilla.inheritance.homework;

public class OldSystem extends OperatingSystem {

    public OldSystem(int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        System.out.println("Old system is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Old system is off");
    }
}
