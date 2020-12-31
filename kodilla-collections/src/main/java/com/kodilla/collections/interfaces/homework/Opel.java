package com.kodilla.collections.interfaces.homework;

import java.util.Objects;
import java.util.Random;

public class Opel implements Car {

    private int speed;

    public Opel(int speed) {
        this.speed = speed;
    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        Random random = new Random();
        speed = getSpeed() + (random.nextInt(20) + 1);

    }

    @Override
    public void decreaseSpeed() {
        Random random = new Random();
        speed = getSpeed() - (random.nextInt(40) + 1);

    }

    @Override
    public String toString() {
        return "Opel{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Opel opel = (Opel) o;
        return speed == opel.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
