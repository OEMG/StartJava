package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int secretNumber = (int) (Math.random() * 100) + 1;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        Scanner scan = new Scanner(System.in);
        do {
            if (isGuessed(player1, scan)) {
                break;
            }
            if (isGuessed(player2, scan)) {
                break;
            }
        } while (true);
    }

    private boolean isGuessed(Player player, Scanner scan) {
        System.out.print(player.getName() + " введи число: ");
        player.setNumber(scan.nextInt());
        int number = player.getNumber();
        if (number > secretNumber) {
            System.out.println("Число " + number + " больше того, что загадал компьютер");
        } else if (number < secretNumber) {
            System.out.println("Число " + number + " меньше того, что загадал компьютер");
        } else {
            System.out.println(player.getName() + " выиграл. Компьютер загадал число: " + secretNumber);
            return true;
        }
        return false;
    }
}