package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        String player1 = scan.nextLine();
        System.out.print("Введите имя второго игрока: ");
        String player2 = scan.nextLine();
        GuessNumber game = new GuessNumber(player1, player2);
        String answer = "yes";
        do {
            if ("yes".equals(answer)) {
                System.out.println("Игра началась! У каждого игрока по 10 попыток.");
                game.play();
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            answer = scan.next();
        } while (!"no".equals(answer));
    }
}
