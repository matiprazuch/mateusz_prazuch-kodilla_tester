package com.kodilla.inheritance.homework;

public class OperatingSystemApp {
    public static void main(String[] args) {
        OperatingSystem opSys = new OperatingSystem(2018);
        OldSystem oldSys = new OldSystem(2015);
        NewSystem newSys = new NewSystem(2021);

        opSys.turnOn();
        System.out.println(opSys.getYear());
        oldSys.turnOff();
        System.out.println(oldSys.getYear());
        newSys.turnOn();
        System.out.println(newSys.getYear());

    }
}
