package com.kodilla.collections.adv.immutable.homework;

public class UserApp {
    public static void main(String[] args) {
        User user = new User("john", "doe");
        user.setName("mike");
        System.out.println("User name: " + user.getName() + ", user surname: " + user.getSurname());

        user.setName("albert");
        user.setSurname("smith");
        System.out.println("User name: " + user.getName() + ", user surname: " + user.getSurname());
    }
}
