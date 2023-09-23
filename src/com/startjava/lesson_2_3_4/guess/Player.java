package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int num;
    private int[] guesses = new int[10];
    private int guessesCount = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setGuesses(int i) {
        guesses[guessesCount] = i;
    }

    public int getGuessesLength() {
        return guesses.length;
    }

    public int getGuessesCount() {
        return guessesCount;
    }

    public void setGuessesCount(int guessesCount) {
        this.guessesCount = guessesCount;
    }

    public void showGuesses() {
        for(int i: Arrays.copyOf(guesses, guessesCount)){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void clearGuesses() {
        Arrays.fill(guesses, 0, guessesCount, 0);
        guessesCount = 0;
    }
}