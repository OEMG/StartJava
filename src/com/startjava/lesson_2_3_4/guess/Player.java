package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] guesses = new int[10];
    private int attempt;

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
        guesses[attempt++] = num;
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
}