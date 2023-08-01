import java.util.Scanner;

import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int secretNumber = (int) (Math.random() * 100) + 1;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    private boolean playerMove(Player player, Scanner scan) {
        System.out.print(player.getName() + " введи число: ");
        player.setNumber(scan.nextInt());
        if (player.getNumber() > secretNumber) {
            System.out.println("Число " + player.getNumber() + " больше того, что загадал компьютер");
            return false;
        } else if (player.getNumber() < secretNumber) {
            System.out.println("Число " + player.getNumber() + " меньше того, что загадал компьютер");
            return false;
        } else {
            System.out.println(player.getName() + " выиграл. Компьютер загадал число: " + secretNumber);
            return true;
        }
    }

    public void play() {
        Scanner scan = new Scanner(System.in);
        do {
            if (playerMove(player1, scan)) {
                break;
            }
            if (playerMove(player2, scan)) {
                break;
            }
        } while (true);
        scan.close();
    }
}
