package com.kodilla.inheritance.homework;

public class NewSystem extends OperatingSystem {

    public NewSystem(int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        System.out.println("New system is on");
    }

    @Override
    public void turnOff() {
        System.out.println("New system is off");
    }
}
