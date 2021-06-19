package com.kodilla.collections.interfaces.homework;

import java.util.Objects;
import java.util.Random;

public class Ford implements Car {

    private int speed;
    private Random random;

    public Ford(int speed) {
        this.speed = speed;
        this.random = new Random();
    }
    @Override
    public int getSpeed() {
        if (speed < 0) {
            return 0;
        } else if (speed > 240){
            return 240;
        } else {
            return speed;
        }
    }

    @Override
    public void increaseSpeed() {
        speed = getSpeed() + (random.nextInt(30) + 1);
    }

    @Override
    public void decreaseSpeed() {
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
