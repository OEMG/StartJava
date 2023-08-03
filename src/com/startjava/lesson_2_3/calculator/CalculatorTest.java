package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        String answer;
        do {
            System.out.print("\nВведите первое число: ");
            calc.setNum1(scan.nextInt());
            System.out.print("Введите знак математической операции: ");
            calc.setSign(scan.next().charAt(0));
            System.out.print("Введите второе число: ");
            calc.setNum2(scan.nextInt());
            System.out.println("Результат: " + calc.calculate());
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scan.next();
            } while (!"yes".equals(answer) && !"no".equals(answer));
        } while ("yes".equals(answer));
        scan.close();
    }
}