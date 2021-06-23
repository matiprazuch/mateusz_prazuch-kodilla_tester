package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Forrest","3x2", "yes"));
        stamps.add(new Stamp("Baloon","1x2", "no"));
        stamps.add(new Stamp("Historic","3x4", "yes"));
        stamps.add(new Stamp("Winter","2x2", "yes"));
        stamps.add(new Stamp("Person","3x1", "no"));
        stamps.add(new Stamp("Forrest","3x2", "yes"));
        stamps.add(new Stamp("Baloon","1x2", "no"));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
