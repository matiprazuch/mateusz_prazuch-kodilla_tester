package com.kodilla.collections.adv.immutable;

class BookHacked extends Book {
    private String realTitle;
    private String realAuthor;

    public BookHacked(String author, String title) {
        super(author, title);
        realTitle = title;
    }

    public void modifyTitle(String newTitle) { realTitle = newTitle; }

    public void modifyAuthor(String newAuthor) {realAuthor = newAuthor; }

    @Override
    public String getTitle() {
        return realTitle;
    }

    @Override
    public String getAuthor() {
        return realAuthor;
    }
}
