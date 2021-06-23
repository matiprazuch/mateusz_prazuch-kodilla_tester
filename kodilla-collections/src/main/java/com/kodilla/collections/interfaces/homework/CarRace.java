package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Car ford = new Ford(120);
        doRace(ford);
        Car opel = new Opel(100);
        doRace(opel);
        Car volvo = new Volvo(150);
        doRace(volvo);
    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        car.increaseSpeed();
        System.out.println("Predkosc samochodu wynosi: " + car.getSpeed());

    }
}