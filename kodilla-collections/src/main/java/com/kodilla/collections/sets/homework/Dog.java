package com.kodilla.collections.sets.homework;

import java.io.Serializable;

public class Dog {
    public String name;
    public Double yearPassed;

    public Dog(String name, Double yearPassed) {
        this.name = name;
        this.yearPassed = yearPassed;
    }

    public boolean isAlive() {
        if (yearPassed == null) {
            return true;
        }
        return false;
    }

    public Serializable isLiving() {
        if (yearPassed == null) {
            return "Still alive and well";
        }
        return yearPassed;
    }
}
