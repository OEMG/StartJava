package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
import static com.startjava.lesson_2_3_4.guess.GuessNumber.PLAYER_COUNT;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] names = new String[PLAYER_COUNT];
        for (int i = 0; i < names.length; i++) {
            System.out.print("Введите имя " + (i + 1) + "-го игрока: ");
            names[i] = scan.nextLine();
        }
        GuessNumber game = new GuessNumber(names);
        System.out.println("Игра началась! В каждом раунде игроку дается по 10 попыток.\n" +
                "Победитель определится по результату трех раудов");
        String answer = "yes";
        do {
            if ("yes".equals(answer)) {
                game.play();
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            answer = scan.next();
        } while (!"no".equals(answer));
    }
}
