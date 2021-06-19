package com.kodilla.collections.interfaces.homework;

import java.util.Objects;
import java.util.Random;

public class Volvo implements Car {

    private int speed;
    private Random random;

    public Volvo(int speed) {
        this.speed = speed;
        this.random = new Random();
    }

    @Override
    public int getSpeed() {
        if (speed < 0) {
            return 0;
        } else if (speed > 300){
            return 300;
        } else {
            return speed;
        }
    }

    @Override
    public void increaseSpeed() {
        speed = getSpeed() + (random.nextInt(60) + 1);

    }

    @Override
    public void decreaseSpeed() {
        speed = getSpeed() - (random.nextInt(50) + 1);

    }

    @Override
    public String toString() {
        return "Volvo{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volvo volvo = (Volvo) o;
        return speed == volvo.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
