package com.kodilla.abstracts;

public class Application {
    public static void main(String[] args) {
        Dog dog = new Dog(4);
        dog.giveVoice();
        System.out.println(dog.getNumberOfLegs());

        Duck duck = new Duck(2);
        duck.giveVoice();
        System.out.println(duck.getNumberOfLegs());
        System.out.println("-----------------------------------");

        AnimalProcessor processor = new AnimalProcessor();
        processor.process(dog);
        processor.process(duck);
    }
}
