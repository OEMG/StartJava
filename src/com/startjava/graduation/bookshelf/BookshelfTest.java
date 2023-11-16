package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {

    static Bookshelf bs = new Bookshelf();
    static Scanner scan = new Scanner(System.in);
    static boolean finished = false;

    public static void main(String[] args) {
        while (!finished) {
            printBookshelf();
            printMenu();
            try {
                launchMenu();
            } catch (RuntimeException e) {
                System.out.println("\nОшибка: " + e.getMessage());
            }
            System.out.print("\nДля продолжения нажмите Enter");
            new Scanner(System.in).nextLine();
        }
        scan.close();
    }

    private static void printBookshelf() {
        int bookCount = bs.getBookCount();
        if (bookCount == 0) {
            System.out.println("\nШкаф пуст. Вы можете добавить в него первую книгу\n");
        } else {
            System.out.println("\nВ шкафу книг - " + bookCount + ", свободно полок - " + bs.getFreeShelves());
            int maxLength = bs.getMaxLength();
            Book[] books = bs.getBooks();
            for (int i = 0; i < bookCount; i++) {
                System.out.print("\n|" + books[i] + " ".repeat(maxLength - books[i].getLength()) +
                        "|\n|" + "-".repeat(maxLength) + "|");
            }
            System.out.println("\n|" + " ".repeat(maxLength) + "|\n");
        }
    }

    private static void printMenu() {
        System.out.println("""
                1. Добавить новую книгу
                2. Поиск по названию
                3. Удалить книгу
                4. Очистить шкаф
                5. Завершить
                		""");
        System.out.print("Введите команду: ");
    }

    private static void launchMenu() {
        switch (checkNum()) {
            case 1 -> addBook();
            case 2 -> findBook();
            case 3 -> deleteBook();
            case 4 -> bs.clear();
            case 5 -> finished = true;
            default -> throw new RuntimeException("Команда не поддерживается. Повторите попытку");
        }
    }

    private static int checkNum() {
        try {
            return scan.nextInt();
        } catch (Exception e) {
            throw new RuntimeException("введите целое число");
        }
    }

    private static void addBook() {
        scan = new Scanner(System.in);
        System.out.print("\nВведите автора книги: ");
        String author = scan.nextLine();
        System.out.print("Введите название книги: ");
        String title = scan.nextLine();
        System.out.print("Введите год издания: ");
        int year = checkNum();
        Book book = new Book(author, title, year);
        bs.add(book);
    }

    private static void findBook() {
        System.out.print("\nВведите название искомой книги: ");
        Book book = bs.find(new Scanner(System.in).nextLine());
        System.out.println(book != null ? book : "\nКнига не найдена");
    }

    private static void deleteBook() {
        System.out.print("\nВведите название удаляемой книги: ");
        bs.delete(new Scanner(System.in).nextLine());
    }
}
