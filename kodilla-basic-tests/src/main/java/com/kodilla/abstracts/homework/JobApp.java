package com.kodilla.abstracts.homework;

public class JobApp {
    public static void main(String[] args) {
        Person person1 = new Person("John", 29, new BusDriver("Driving", 2500));
        Person person2 = new Person("Michael", 35, new Lawyer("Defending", 7000));
        Person person3 = new Person("Peter", 40, new Doctor("Operating", 9000));
        JobProcessor processor = new JobProcessor();
        processor.process(person1);
        processor.process(person2);
        processor.process(person3);
    }
}
