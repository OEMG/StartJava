package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    public static final int MAX_ATTEMPTS = 10;
    private final String name;
    private final int[] guesses = new int[MAX_ATTEMPTS];
    private int attempt;
    private int score;

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
        if (num >= GuessNumber.MIN_NUMBER && num <= GuessNumber.MAX_NUMBER) {
            guesses[attempt++] = num;
            return;
        }
        throw new RuntimeException("Ошибка: число должно находиться в полуинтервале (0, 100]\n");
    }

    public int[] getGuesses() {
        return Arrays.copyOf(guesses, attempt);
    }

    public void clear() {
        Arrays.fill(guesses, 0, attempt, 0);
        attempt = 0;
    }

    public int getAttempt() {
        return attempt;
    }

    public void upScore() {
        score++;
    }

    public int getScore() {
        return score;
    }

    public void clearScore() {
        score = 0;
    }
}