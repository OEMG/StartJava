package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
    }

    public void play() {
        Scanner scan = new Scanner(System.in);
        int secretNum = (int) (Math.random() * 100) + 1;
        for (int i = 0; i < 10; i++) {
            if (isGuessed(player1, scan, secretNum)) {
                break;
            }
            if (isGuessed(player2, scan, secretNum)) {
                break;
            }
        }
        player1.showGuesses();
        player1.clearGuesses();
        player2.showGuesses();
        player2.clearGuesses();
    }

    private boolean isGuessed(Player player, Scanner scan, int secretNum) {
        String name = player.getName();
        int count = player.getGuessesCount();
        System.out.print(name + " введи число: ");
        player.setNum(scan.nextInt());
        player.setGuesses(player.getNum());
        player.setGuessesCount(count + 1);
        int num = player.getNum();
        if (num < secretNum) {
            System.out.println("Число " + num + " меньше того, что загадал компьютер");
            guessingOver(player);
        } else if (num > secretNum) {
            System.out.println("Число " + num + " больше того, что загадал компьютер");
            guessingOver(player);
        } else {
            System.out.println("Игрок " + name + " угадал " + secretNum
                    + " с " + (count + 1) + " попытки");
            return true;
        }
        return false;
    }

    private void guessingOver(Player player) {
        if (player.getGuessesCount() >= player.getGuessesLength()) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
    }
}