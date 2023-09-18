package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public double calculate(String expression) {
        String[] components = expression.split(" ");
        int num1 = Integer.parseInt(components[0]);
        char sign = components[1].charAt(0);
        int num2 = Integer.parseInt(components[2]);
        return switch (sign) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> (double) num1 / num2;
            case '%' -> num1 % num2;
            case '^' -> Math.pow(num1, num2);
            default -> {
                System.out.println("Ошибка: знак " + sign + " не поддерживается");
                yield Double.MIN_VALUE;
            }
        };
    }
}