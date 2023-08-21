package com.startjava.lesson_1._final;

public class MyFirstGame {

    public static void main(String[] args) {
        int secretNumber = (int) (Math.random() * 100) + 1;
        int playerNumber = 99;
        while (playerNumber != secretNumber) {
            if (secretNumber < playerNumber) {
                System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
            } else {
                System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
            }
            playerNumber = playerNumber % 100 + 1;
        }
        System.out.println("Вы победили!");
    }
}