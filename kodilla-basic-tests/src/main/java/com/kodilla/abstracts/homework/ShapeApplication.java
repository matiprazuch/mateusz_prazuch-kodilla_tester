package com.kodilla.abstracts.homework;

public class ShapeApplication {
    public static void main(String[] args) {
        Square square = new Square(8);
        Rectangle rectangle = new Rectangle(3, 4);
        Triangle triangle = new Triangle(7,4);
        ShapeProcessor processor = new ShapeProcessor();
        processor.process(square);
        processor.process(rectangle);
        processor.process(triangle);

    }
}
