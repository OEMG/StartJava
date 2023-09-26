package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
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
        showGuesses(player1);
        clearGuesses(player1);
        showGuesses(player2);
        clearGuesses(player2);
    }

    private boolean isGuessed(Player player, Scanner scan, int secretNum) {
        String name = player.getName();
        int count = player.getAttempt();
        System.out.print(name + " введи число: ");
        player.setGuess(count, scan.nextInt());
        int num = player.getGuess(count);
        player.setAttempt(count + 1);
        if (num < secretNum) {
            System.out.println("Число " + num + " меньше того, что загадал компьютер");
            attemptsOver(player);
        } else if (num > secretNum) {
            System.out.println("Число " + num + " больше того, что загадал компьютер");
            attemptsOver(player);
        } else {
            System.out.println("Игрок " + name + " угадал " + secretNum
                    + " с " + (count + 1) + " попытки");
            return true;
        }
        return false;
    }

    private void attemptsOver(Player player) {
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

    public void clearGuesses(Player player) {
        Arrays.fill(player.getGuesses(), 0, player.getAttempt(), 0);
        player.setAttempt(0);
    }
}