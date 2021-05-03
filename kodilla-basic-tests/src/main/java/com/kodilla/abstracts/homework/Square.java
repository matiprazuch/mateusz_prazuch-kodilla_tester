package com.kodilla.abstracts.homework;

public class Square extends Shape {

    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public double area() {
        return a * a;
    }

    @Override
    public int perimeter() {
        return a * 4;
    }

    @Override
    public String toString() {
        return "Square";
    }
}
