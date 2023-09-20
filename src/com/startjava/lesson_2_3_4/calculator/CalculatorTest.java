package com.startjava.lesson_2_3_4.calculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        String answer = "yes";
        do {
            if ("yes".equals(answer)) {
                System.out.print("\nВведите математическое выражение: ");
                String expression = scan.nextLine();
                double result = calc.calculate(expression);
                print(expression, result);
            }
            System.out.print("\nХотите продолжить вычисления? [yes/no]: ");
            answer = scan.nextLine();
        } while (!"no".equals(answer));
        scan.close();
    }

    private static void print(String expression, double result) {
        DecimalFormat df = new DecimalFormat("#.###");
        if (result != Double.MIN_VALUE) {
            System.out.print(expression + " = " + df.format(result));
        }
    }
}