package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    public static List<Book> bookDirectory = new ArrayList<>();

    public static Book createBook(String title, String author) {
        Book newBook = new Book(title, author);
        for (Book book : bookDirectory) {
        }
        bookDirectory.add(newBook);
        return newBook;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
