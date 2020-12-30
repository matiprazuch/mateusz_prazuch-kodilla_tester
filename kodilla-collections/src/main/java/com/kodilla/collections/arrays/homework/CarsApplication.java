package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Volvo;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int n = 0; n < cars.length; n++) {
            cars[n] = drawCar();
            cars[n].increaseSpeed();
        }
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawnCarType = random.nextInt(3);
        if (drawnCarType == 0)
            return new Ford(120);
        else if (drawnCarType == 1)
            return new Opel(100);
        else
            return new Volvo(150);
    }
}