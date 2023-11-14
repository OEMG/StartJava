package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] names = new String[GuessNumber.PLAYERS_COUNT];
        GuessNumber game = new GuessNumber(inputPlayers(names, scan));
        System.out.println("Игра началась! В каждом раунде игроку дается по 10 попыток.\n" +
                "Победитель определится по результату трех раундов");
        String answer = "yes";
        do {
            if ("yes".equals(answer)) {
                game.play();
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            answer = scan.next();
        } while (!"no".equals(answer));
    }

    private static String[] inputPlayers(String[] names, Scanner scan) {
        for (int i = 0; i < GuessNumber.PLAYERS_COUNT; i++) {
            System.out.print("Введите имя " + (i + 1) + "-го игрока: ");
            names[i] = scan.nextLine();
        }
        return names;
    }
}
