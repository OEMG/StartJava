import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int secretNumber;

    public GuessNumber(Player player1, Player player2, int secretNumber) {
        this.player1 = player1;
        this.player2 = player2;
        this.secretNumber = secretNumber;
    }

    private void processPlayerMove(Player player) {
        Scanner scan = new Scanner(System.in);
        System.out.print(player.getName() + " введи число: ");
        player.setNumber(scan.nextInt());
        if (player.getNumber() > secretNumber) {
            System.out.println("Число " + player.getNumber() + " больше того, что загадал компьютер");
        } else if (player.getNumber() < secretNumber) {
            System.out.println("Число " + player.getNumber() + " меньше того, что загадал компьютер");
        } else {
            System.out.println(player.getName() + " выйграл. Компьютер закадал число: " + secretNumber);
        }
    }

    public void play() {
        do {
            processPlayerMove(player1);
            if (player1.getNumber() == secretNumber) {
                break;
            }
            processPlayerMove(player2);
            if (player2.getNumber() == secretNumber) {
                break;
            }
        } while (true);
    }
}
