package com.kodilla.collections.adv.immutable.special.homework;


import static com.kodilla.collections.adv.immutable.special.homework.BookManager.bookDirectory;
import static com.kodilla.collections.adv.immutable.special.homework.BookManager.createBook;

public class BookApplication {
    public static void main(String[] args) {
        BookManager.createBook("Dune", "Frank Herbert");
        BookManager.createBook("Blade Runner", "Philip K. Dick");
        BookManager.createBook("Dune", "Frank Herbert");
        System.out.println(bookDirectory.size());
        System.out.println(bookDirectory.get(0).equals(bookDirectory.get(2)));
        System.out.println(bookDirectory.get(0) == bookDirectory.get(2));
        System.out.println("-------------------------------");

        Book book1 = new Book("Dune", "Frank Herbert");
        Book book2 = new Book("Dune", "Frank Herbert");
        System.out.println(book1.equals(book2));
        System.out.println(book1 == book2);



    }
}
