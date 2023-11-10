package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {

    public static void main(String[] args) {
        Bookshelf bs = new Bookshelf();
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("""
					1. Добавить новую книгу
					2. Поиск по названию
					3. Удалить книгу
					4. Вывод всех книг
					5. Очистить шкаф
					6. Завершить
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
                        bs.add(author, title, year);
                    }
                    case 2 -> {
                        System.out.print("\nВведите название искомой книги: ");
                        bs.find(new Scanner(System.in).nextLine());
                    }
                    case 3 -> {
                        System.out.print("\nВведите название удаляемой книги: ");
                        bs.delete(new Scanner(System.in).nextLine());
                    }
                    case 4 -> bs.output();
                    case 5 -> bs.clear();
                    case 6 -> {
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
            System.out.println(bs);
        }
    }

    public static int checkNum(Scanner scan) {
        try {
            return scan.nextInt();
        } catch (Exception e) {
            throw new RuntimeException("введите целое число");
        }
    }
}
