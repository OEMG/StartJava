package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import static com.startjava.lesson_2_3_4.guess.GuessNumber.MIN_NUMBER;
import static com.startjava.lesson_2_3_4.guess.GuessNumber.MAX_NUMBER;

public class Player {
    public static final int MAX_ATTEMPTS = 10;
    private final String name;
    private final int[] guesses = new int[MAX_ATTEMPTS];
    private int attempt;
    private int win;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getGuess() {
        return guesses[attempt - 1];
    }

    public void addGuess(int num) {
        if (num > MIN_NUMBER && num <= MAX_NUMBER) {
            guesses[attempt++] = num;
        } else {
            throw new RuntimeException("Ошибка: число должно находиться в полуинтервале (0, 100]\n" +
                    getName() + " введи число: ");
        }
    }

    public int[] getGuesses() {
        return Arrays.copyOf(guesses, attempt);
    }

    public void clearGuesses() {
        Arrays.fill(guesses, 0, attempt, 0);
        attempt = 0;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setWin() {
        win = win + 1;
    }

    public int getWin() {
        return win;
    }

    public void clearWin() {
        win = 0;
    }
}