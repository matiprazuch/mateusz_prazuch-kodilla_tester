package com.kodilla.collections.interfaces.homework;

import java.util.Objects;
import java.util.Random;

public class Ford implements Car {

    private int speed;

    public Ford(int speed) {
        this.speed = speed;
    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        Random random = new Random();
        speed = getSpeed() + (random.nextInt(30) + 1);
    }

    @Override
    public void decreaseSpeed() {
        Random random = new Random();
        speed = getSpeed() - (random.nextInt(50) + 1);

    }

    @Override
    public String toString() {
        return "Ford{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ford ford = (Ford) o;
        return speed == ford.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
