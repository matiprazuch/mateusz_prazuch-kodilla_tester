package com.kodilla.collections.adv.maps.complex;

import java.util.ArrayList;
import java.util.List;

public class Grades {
    private List<Double> grades = new ArrayList<>();

    public Grades(double... grades) {
        for (double grade : grades)
            this.grades.add(grade);
    }
}