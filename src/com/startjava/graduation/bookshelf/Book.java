package com.startjava.graduation.bookshelf;

public class Book {

    private final String author;
    private final String title;
    private final int publicationYear;
    private final int length;

    public Book(String author, String title, int publicationYear) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
        length = toString().length();
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return author + ", " + title + ", " + publicationYear;
    }
}
