package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    private static final int BOOKS_NUM = 10;
    private final Book[] books = new Book[BOOKS_NUM];
    private int bookCount;
    private int maxLength;

    public Book[] getBooks() {
        return Arrays.copyOf(books, bookCount);
    }

    public int getBookCount() {
        return bookCount;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public int getFreeShelves() {
        return BOOKS_NUM - bookCount;
    }

    public void add(Book book) {
        if (bookCount >= BOOKS_NUM) {
            System.out.println("\nКнига не сохранена. Место на полках закончилось.");
            return;
        }
        books[bookCount++] = book;
        int length = book.getLength();
        if (length > maxLength) {
            maxLength = length;
        }
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
                calcMaxLength(books[i].getLength());
                books[bookCount] = null;
                System.out.println("\nКнига удалена.");
                return;
            }
        }
        System.out.println("\nКнига не найдена");
    }

    private void calcMaxLength(int length) {
        if (length == maxLength) {
            maxLength = -1;
            for (int i = 0; i < bookCount; i++) {
                if (books[i].getLength() > maxLength) {
                    maxLength = books[i].getLength();
                }
            }
        }
    }

    public void clear() {
        Arrays.fill(books, 0, bookCount, null);
        bookCount = 0;
    }
}