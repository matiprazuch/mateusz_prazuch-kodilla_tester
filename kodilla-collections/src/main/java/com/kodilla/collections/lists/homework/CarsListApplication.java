package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Volvo;
import com.kodilla.collections.arrays.homework.CarUtils;

import java.util.LinkedList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new LinkedList<>();
        cars.add(new Volvo(120));
        cars.add(new Ford(100));
        cars.add(new Opel(90));
        cars.add(new Opel(70));
        cars.add(new Volvo(150));
        Car volvo = new Volvo(150);
        cars.remove(2);
        cars.remove(new Volvo(150));
        cars.add(volvo);
        System.out.println(cars);
        cars.remove(volvo);

        System.out.println(cars);

        for(Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}