package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        DecimalFormat dF = new DecimalFormat("#.###");
        String answer = "yes";
        do {
            if ("yes".equals(answer)) {
                System.out.print("\nВведите математическое выражение: ");
                calc.setExpression(scan.nextLine());
                System.out.println(dF.format(calc.calculate()));
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scan.next();
            scan.nextLine();
        } while (!"no".equals(answer));
        scan.close();
    }
}