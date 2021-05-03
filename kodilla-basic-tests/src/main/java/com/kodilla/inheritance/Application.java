package com.kodilla.inheritance;

public class Application {
    public static void main(String[] args) {
        Car car = new Car(4,5);
        Convertible convertible = new Convertible(4,2);
        car.turnOnLights();
        convertible.openRoof();
        convertible.turnOnLights();
        System.out.println("---------------------------");
        car.openDoors();
        convertible.openDoors();
        System.out.println(convertible.getSeats());
        convertible.displayNumberOfSeats();
    }
}
