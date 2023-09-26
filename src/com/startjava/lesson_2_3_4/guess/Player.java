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

    public int[] getGuesses() {
        return Arrays.copyOf(guesses, attempt);
    }

    public int getGuess(int index) {
        return guesses[index];
    }

    public void setGuess(int attempt, int num) {
        guesses[attempt] = num;
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }
}