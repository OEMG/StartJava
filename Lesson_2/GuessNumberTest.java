import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scan.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scan.nextLine());
        boolean continueGame = false;
        do {
            int secretNumber = (int) (Math.random() * 100) + 1;
            GuessNumber guessNumber = new GuessNumber(player1, player2, secretNumber);
            guessNumber.play();
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            boolean wrongAnswer;
            do {
                switch (scan.next()) {
                    case "yes" -> {
                        continueGame = true;
                        wrongAnswer = false;
                    }
                    case "no" -> {
                        continueGame = false;
                        wrongAnswer = false;
                    }
                    default -> {
                        System.out.print("Хотите продолжить игру? [yes/no]: ");
                        wrongAnswer = true;
                    }
                }
            } while (wrongAnswer);
        } while (continueGame);
        scan.close();
    }
}