package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {

    public static void main(String[] args) {
        Bookshelf bs = new Bookshelf();
        while (true) {
            Scanner scan = new Scanner(System.in);
            genBookshelf(bs);
            System.out.println("""
                    1. Добавить новую книгу
                    2. Поиск по названию
                    3. Удалить книгу
                    4. Очистить шкаф
                    5. Завершить
                    		""");
            System.out.print("Введите команду: ");
            try {
                switch (checkNum(scan)) {
                    case 1 -> {
                        scan = new Scanner(System.in);
                        System.out.print("\nВведите автора книги: ");
                        String author = scan.nextLine();
                        System.out.print("Введите название книги: ");
                        String title = scan.nextLine();
                        System.out.print("Введите год издания: ");
                        int year = checkNum(scan);
                        Book book = new Book(author, title, year);
                        bs.add(book);
                    }
                    case 2 -> {
                        System.out.print("\nВведите название искомой книги: ");
                        Book book = bs.find(new Scanner(System.in).nextLine());
                        System.out.println(book != null ? book : "\nКнига не найдена");
                    }
                    case 3 -> {
                        System.out.print("\nВведите название удаляемой книги: ");
                        bs.delete(new Scanner(System.in).nextLine());
                    }
                    case 4 -> bs.clear();
                    case 5 -> {
                        scan.close();
                        return;
                    }
                    default -> throw new RuntimeException("Команда не поддерживается. Повторите попытку");
                }
            } catch (RuntimeException e) {
                System.out.println("\nОшибка: " + e.getMessage());
            }
            System.out.print("\nДля продолжения нажмите Enter");
            new Scanner(System.in).nextLine();
        }
    }

    private static void genBookshelf(Bookshelf bs) {
        int bookCount = bs.getBookCount();
        if (bookCount == 0) {
            System.out.println("\nШкаф пуст. Вы можете добавить в него первую книгу\n");
            return;
        } else {
            System.out.println("\nВ шкафу книг - " + bookCount + ", свободно полок - " + bs.getAvailableShelves());
        }
        int maxLength = bs.getMaxLength();
        Book[] books = bs.getBooks();
        for (int i = 0; i < bookCount; i++) {
            System.out.print("\n|" + books[i] + " ".repeat(maxLength - books[i].getLengthDesc()) +
                    "|\n|" + "-".repeat(maxLength) + "|");
        }
        System.out.println("\n|" + " ".repeat(maxLength) + "|\n");
    }

    private static int checkNum(Scanner scan) {
        try {
            return scan.nextInt();
        } catch (Exception e) {
            throw new RuntimeException("введите целое число");
        }
    }
}
