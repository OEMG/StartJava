package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;
<<<<<<< HEAD
import static com.startjava.lesson_2_3_4.guess.Player.MAX_ATTEMPTS;

public class GuessNumber {
    public static final int PLAYER_COUNT = 3;
    public static final int ROUND_COUNT = 3;
    public static final int MIN_NUMBER = 0;
    public static final int MAX_NUMBER = 100;
=======
import static com.startjava.lesson_2_3_4.guess.GuessNumberTest.PLAYER_COUNT;
import static com.startjava.lesson_2_3_4.guess.Player.MAX_NUMBER;
import static com.startjava.lesson_2_3_4.guess.Player.MAX_ATTEMPTS;

public class GuessNumber {
    public static final int ROUND_COUNT = 3;
>>>>>>> ee5b91976f2be6a18d863ae4ad8e4b1d3ca10993
    private final Player[] players = new Player[PLAYER_COUNT];
    private int secretNum;

    public GuessNumber(String... name) {
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(name[i]);
        }
    }

    public void play() {
        shufflePlayers(players);
        for (int i = 0; i < ROUND_COUNT; i++) {
            System.out.println("\n" + (i + 1) + " раунд");
            secretNum = (int) (Math.random() * MAX_NUMBER) + 1;
<<<<<<< HEAD
            System.out.println(secretNum);
=======
>>>>>>> ee5b91976f2be6a18d863ae4ad8e4b1d3ca10993
            startRound(players);
            endRound(players);
        }
        getWinner(players);
        clearWins(players);
    }

    private void shufflePlayers(Player[] players) {
        for (int i = players.length - 1; i > 0; i--) {
            int index = (int) Math.floor(Math.random() * (i + 1));
            Player temp = players[i];
            players[i] = players[index];
            players[index] = temp;
        }
    }

    private void startRound(Player[] players) {
        for (int j = 0; j < MAX_ATTEMPTS; j++) {
            boolean anyPlayerGuessed = false;
            for (Player player : players) {
                if (isGuessed(player)) {
                    anyPlayerGuessed = true;
                    break;
                }
            }
            if (anyPlayerGuessed) {
                break;
            }
        }
    }

    private boolean isGuessed(Player player) {
        inputGuess(player);
        int num = player.getGuess();
        String message = (num < secretNum) ? " меньше " : " больше ";
        if (num != secretNum) {
            System.out.println("Число " + num + message + "того, что загадал компьютер");
            stopGuess(player);
        } else {
            System.out.println("Игрок " + player.getName() + " угадал " + secretNum
                    + " с " + player.getAttempt() + " попытки");
            player.setWin();
            return true;
        }
        return false;
    }

    private static void inputGuess(Player player) {
        Scanner scan = new Scanner(System.in);
        System.out.print(player.getName() + " введи число: ");
        do {
            try {
                player.addGuess(scan.nextInt());
                break;
            } catch (RuntimeException e) {
                System.out.print(e.getMessage());
            }
        } while (true);
    }

    private void stopGuess(Player player) {
        if (player.getAttempt() >= MAX_ATTEMPTS) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
    }

    private void endRound(Player[] players) {
        for (Player player : players) {
<<<<<<< HEAD
=======

>>>>>>> ee5b91976f2be6a18d863ae4ad8e4b1d3ca10993
            showGuesses(player);
            player.clearGuesses();
        }
    }

    private void showGuesses(Player player) {
        System.out.print("Попытки игрока " + player.getName() + ": ");
        for (int i : player.getGuesses()) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private void getWinner(Player[] players) {
<<<<<<< HEAD
        String winner = null;
        int maxWins = -1;
        boolean tie = false;
=======
        int maxWins = -1;
        String winner = null;
>>>>>>> ee5b91976f2be6a18d863ae4ad8e4b1d3ca10993
        for (Player player : players) {
            int playerWins = player.getWin();
            if (playerWins > maxWins) {
                maxWins = playerWins;
                winner = player.getName();
<<<<<<< HEAD
                tie = false;
            } else if (playerWins == maxWins) {
                tie = true;
            }
        }
        if (tie) {
            System.out.println("У игроков ничья");
        } else {
            System.out.println(winner + " победил!");
        }
=======
            } else if (playerWins == maxWins) {
                System.out.println("У игроков ничья");
                return;
            }
        }
        System.out.println(winner + " победил!");
>>>>>>> ee5b91976f2be6a18d863ae4ad8e4b1d3ca10993
    }

    private void clearWins(Player[] players) {
        for (Player player : players) {
            player.clearWin();
        }
    }
}