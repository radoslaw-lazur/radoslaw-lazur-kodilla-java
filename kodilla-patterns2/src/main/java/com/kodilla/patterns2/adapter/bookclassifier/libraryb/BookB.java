package com.kodilla.patterns2.adapter.bookclassifier.libraryb;

public class BookB {
    private final String author;
    private final String title;
    private final double yearOfPublication;

    public BookB(final String author, final String title, final double yearOfPublication) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public double getYearOfPublication() {
        return yearOfPublication;
    }
}
