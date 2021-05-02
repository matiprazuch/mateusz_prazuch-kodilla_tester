package com.kodilla.collections.sets.homework;

import java.util.ArrayList;

public class DogList {
    public static void main(String[] args) {

        ArrayList<Dog> dogs = new ArrayList<>();

        Dog dog1 = new Dog("Tola", 06.2016);
        Dog dog2 = new Dog("Misia", 10.2019);
        Dog dog3 = new Dog("Finka", 08.2017);
        Dog dog4 = new Dog("Kropka", null);

        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        dogs.add(dog4);

        System.out.println(dogs.size());
        System.out.println((dogs.get(0)).name);
        System.out.println((dogs.get(0)).yearPassed);
        System.out.println("--------------------------");
        System.out.println((dogs.get(0)).name + "---Is alive: " + (dogs.get(0)).isAlive() + "---Passed away in: " + (dogs.get(0)).isLiving());
        System.out.println((dogs.get(1)).name + "---Is alive: " + (dogs.get(1)).isAlive() + "---Passed away in: " + (dogs.get(1)).isLiving());
        System.out.println((dogs.get(2)).name + "---Is alive: " + (dogs.get(2)).isAlive() + "---Passed away in: " + (dogs.get(2)).isLiving());
        System.out.println((dogs.get(3)).name + "---Is alive: " + (dogs.get(3)).isAlive() + "---Passed away in: " + (dogs.get(3)).isLiving());

    }
}
