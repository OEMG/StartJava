import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scan.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scan.nextLine());
        String answer;
        do {
            GuessNumber guessNumber = new GuessNumber(player1, player2);
            guessNumber.play();
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                answer = scan.next();
            } while (!"yes".equals(answer) && !"no".equals(answer));
        } while ("yes".equals(answer));
        scan.close();
    }
}