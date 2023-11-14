package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    private static final int NUM_BOOKS = 10;
    private final Book[] books = new Book[NUM_BOOKS];
    private int bookCount;
    private int maxLength;

    public Book[] getBooks() {
        return books;
    }

    public int getBookCount() {
        return bookCount;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public int getAvailableShelves() {
        return NUM_BOOKS - bookCount;
    }

    public void add(Book book) {
        if (bookCount == NUM_BOOKS) {
            System.out.println("\nКнига не сохранена. Место на полках закончилось.");
            return;
        }
        books[bookCount] = book;
        int length = book.getLengthDesc();
        if (length > maxLength) {
            maxLength = length;
        }
        bookCount++;
        System.out.println("\nКнига добавлена.");
    }

    public Book find(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equals(title)) {
                return books[i];
            }
        }
        return null;
    }

    public void delete(String title) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equals(title)) {
                bookCount--;
                System.arraycopy(books, i + 1, books, i, bookCount - i);
                System.out.println("\nКнига удалена.");
                checkLength(books[i].getLengthDesc());
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

    public void clear() {
        Arrays.fill(books, 0, bookCount, null);
        bookCount = 0;
        System.out.println("Шкаф очищен.");
    }
}
