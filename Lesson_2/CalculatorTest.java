import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        boolean continueCalk = false;
        do {
            System.out.print("\nВведите первое число: ");
            calc.setNum1(scan.nextInt());
            System.out.print("Введите знак математической операции: ");
            calc.setSign(scan.next().charAt(0));
            System.out.print("Введите второе число: ");
            calc.setNum2(scan.nextInt());
            System.out.println("Результат: " + calc.getResult());
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            boolean wrongAnswer;
            do {
                switch (scan.next()) {
                    case "yes" -> {
                        continueCalk = true;
                        wrongAnswer = false;
                    }
                    case "no" -> {
                        continueCalk = false;
                        wrongAnswer = false;
                    }
                    default -> {
                        System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                        wrongAnswer = true;
                    }
                }
            } while (wrongAnswer);
        } while (continueCalk);
        scan.close();
    }
}