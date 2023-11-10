package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    private static final int NUM_BOOKS = 10;
    private final Book[] books = new Book[NUM_BOOKS];
    private int bookCount;
    private int maxLength;

    public Bookshelf() {
        System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу\n");
    }

    public void add(String author, String title, int year) {
        if (bookCount == 10) {
            System.out.println("\nКнига не сохранена. Место на полках закончилось.");
            return;
        }
        Book book = new Book(author, title, year);
        books[bookCount] = book;
        if (book.getLengthDesc() > maxLength) {
            maxLength = book.getLengthDesc();
        }
        bookCount++;
        System.out.println("\nКнига добавлена.");
    }

    public void find(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equals(title)) {
                System.out.println(books[i]);
                return;
            }
        }
        System.out.println("\nКнига не найдена");
    }

    public void delete(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equals(title)) {
                int bookLength = books[i].getLengthDesc();
                System.arraycopy(books, i + 1, books, i, books.length - 1 - i);
                bookCount--;
                checkLength(bookLength);
                System.out.println("\nКнига удалена.");
                return;
            }
        }
        System.out.println("\nКнига не найдена");
    }

    public void checkLength(int bookLength) {
        if (bookLength == maxLength) {
            maxLength = -1;
            for (int i = 0; i < bookCount; i++) {
                if (books[i].getLengthDesc() > maxLength) {
                    maxLength = books[i].getLengthDesc();
                }
            }
        }
    }

    public void output() {
        if (bookCount != 0) {
            System.out.println(genBookshelf());
            return;
        }
        System.out.println("\nВ шкафу нет книг.");
    }

    public void clear() {
        Arrays.fill(books, 0, bookCount, null);
        bookCount = 0;
        System.out.println("\nШкаф очищен.");
    }

    @Override
    public String toString() {
        if (bookCount == 0) {
            return "\nШкаф пуст. Вы можете добавить в него первую книгу\n";
        }
        return "\nВ шкафу книг - " + bookCount + ", свободно полок - " + (NUM_BOOKS - bookCount) + "\n" + genBookshelf();
    }

    private String genBookshelf() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bookCount; i++) {
            sb.append("\n|").append(books[i]).append(" ".repeat(maxLength - books[i].getLengthDesc()));
            sb.append("|\n|").append("-".repeat(maxLength)).append("|");
        }
        sb.append("\n|").append(" ".repeat(maxLength)).append("|\n");
        return sb.toString();
    }
}
