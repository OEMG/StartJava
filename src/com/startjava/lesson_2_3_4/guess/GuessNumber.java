package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int secretNum;

    public GuessNumber(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
    }

    public void play() {
        secretNum = (int) (Math.random() * 100) + 1;
        for (int i = 0; i < 10; i++) {
            if (isGuessed(player1)) {
                break;
            }
            if (isGuessed(player2)) {
                break;
            }
        }
        showGuesses(player1);
        showGuesses(player2);
        player1.clearGuesses();
        player2.clearGuesses();
    }

    private boolean isGuessed(Player player) {
        inputGuess(player);
        int num = player.getGuess();
        if (num < secretNum) {
            System.out.println("Число " + num + " меньше того, что загадал компьютер");
            finishGame(player);
        } else if (num > secretNum) {
            System.out.println("Число " + num + " больше того, что загадал компьютер");
            finishGame(player);
        } else {
            System.out.println("Игрок " + player.getName() + " угадал " + secretNum
                    + " с " + player.getAttempt() + " попытки");
            return true;
        }
        return false;
    }

    private static void inputGuess(Player player) {
        Scanner scan = new Scanner(System.in);
        System.out.print(player.getName() + " введи число: ");
        player.addGuess(scan.nextInt());
    }

    private void finishGame(Player player) {
        if (player.getAttempt() >= 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
    }

    public void showGuesses(Player player) {
        for (int i : player.getGuesses()) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}