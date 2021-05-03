package com.kodilla.abstracts.homework;

public class JobProcessor {
    public void process(Person person) {
        System.out.println("Responsibilities of " + person.getFirstName() + " are: " + person.getJob().getResponsibilities() + ". His salary is: " + person.getJob().getSalary());
    }
}
