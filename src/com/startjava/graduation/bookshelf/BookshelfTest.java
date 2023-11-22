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
            scan.nextLine();
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
            for (Book book : books) {
                System.out.print("\n|" + book + " ".repeat(maxLength - book.getLength()) +
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
        switch (scan.nextInt()) {
            case 1 -> addBook();
            case 2 -> findBook();
            case 3 -> deleteBook();
            case 4 -> clearBookshelf();
            case 5 -> finished = true;
            default -> throw new RuntimeException("Команда не поддерживается. Повторите попытку");
        }
    }

    private static void addBook() {
        scan.nextLine();
        System.out.print("\nВведите автора книги: ");
        String author = scan.nextLine();
        System.out.print("Введите название книги: ");
        String title = scan.nextLine();
        System.out.print("Введите год издания: ");
        int year = scan.nextInt();
        scan.nextLine();
        Book book = new Book(author, title, year);
        bs.add(book);
    }

    private static void findBook() {
        System.out.print("\nВведите название искомой книги: ");
        scan.nextLine();
        Book book = bs.find(scan.nextLine());
        System.out.println(book != null ? book : "\nКнига не найдена");
    }

    private static void deleteBook() {
        System.out.print("\nВведите название удаляемой книги: ");
        scan.nextLine();
        bs.delete(scan.nextLine());
    }

    private static void clearBookshelf() {
        bs.clear();
        System.out.println("\nШкаф очищен.");
        scan.nextLine();
    }
}
