package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    private int a;
    private int h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double area() {
        return (a*h)/2;
    }

    @Override
    public int perimeter() {
        return a * 3;
    }

    @Override
    public String toString() {
        return "Triangle";
    }
}
