package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
	public static final int PLAYER_COUNT = 3;
	public static final int ROUND_COUNT = 3;
	public static final int MIN_NUMBER = 1;
	public static final int MAX_NUMBER = 100;
	private final Player[] players = new Player[PLAYER_COUNT];
	private int secretNum;
	private final Scanner scan = new Scanner(System.in);

	public GuessNumber(String... name) {
		for (int i = 0; i < PLAYER_COUNT; i++) {
			players[i] = new Player(name[i]);
		}
	}

	public void play() {
		shuffle();
		for (int i = 0; i < ROUND_COUNT; i++) {
			System.out.println("\n" + (i + 1) + " раунд");
			secretNum = (int) (Math.random() * MAX_NUMBER) + 1;
			startRound();
			endRound();
		}
		checkWinner();
		clearWins();
	}

	private void shuffle() {
		for (int i = PLAYER_COUNT - 1; i > 0; i--) {
			int index = (int) (Math.random() * (i + 1));
			Player temp = players[i];
			players[i] = players[index];
			players[index] = temp;
		}
	}

	private void startRound() {
		for (int i = 0; i < Player.MAX_ATTEMPTS; i++) {
			boolean anyPlayerGuessed = false;
			for (Player player : players) {
				if (isGuessed(player)) {
					player.addWin();
					anyPlayerGuessed = true;
					break;
				}
				endAttempts(player);
			}
			if (anyPlayerGuessed) {
				break;
			}
		}
	}

	private boolean isGuessed(Player player) {
		inputGuess(player);
		int num = player.getGuess();
		if (num == secretNum) {
			System.out.println("Игрок " + player.getName() + " угадал " + secretNum
					+ " с " + player.getAttempt() + " попытки");
			return true;
		}
		String message = (num < secretNum) ? " меньше " : " больше ";
		System.out.println("Число " + num + message + "того, что загадал компьютер");
		return false;
	}

	private void inputGuess(Player player) {
		do {
			System.out.print(player.getName() + " введи число: ");
			try {
				player.addGuess(scan.nextInt());
				break;
			} catch (RuntimeException e) {
				System.out.print(e.getMessage());
			}
		} while (true);
	}

	private void endAttempts(Player player) {
		if (player.getAttempt() >= Player.MAX_ATTEMPTS) {
			System.out.println("У " + player.getName() + " закончились попытки");
		}
	}

	private void endRound() {
		for (Player player : players) {
			showGuesses(player);
			player.clear();
		}
	}

	private void showGuesses(Player player) {
		System.out.print("Попытки игрока " + player.getName() + ": ");
		for (int i : player.getGuesses()) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	private void checkWinner() {
		String winner = null;
		int maxWins = -1;
		boolean tie = false;
		for (Player player : players) {
			int playerWins = player.getScore();
			if (playerWins > maxWins) {
				maxWins = playerWins;
				winner = player.getName();
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
	}

	private void clearWins() {
		for (Player player : players) {
			player.clearScore();
		}
	}
}