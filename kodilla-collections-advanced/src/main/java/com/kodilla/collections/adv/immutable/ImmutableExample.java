package com.kodilla.collections.adv.immutable;

public class ImmutableExample {
    public static void main(String[] args) {
        Book book = new BookHacked("John Stewart", "The Last Chance");
        BookHacked bookHacked = (BookHacked) book;
        bookHacked.modifyTitle("New Title");
        bookHacked.modifyAuthor("New Author");
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
    }
}
