package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static double calculate(String expression) {
        String[] components = expression.split(" ");
        if (components.length != 3) {
            throw new RuntimeException("количество элементов должно быть 3");
        }
        int num1, num2;
        try {
            num1 = Integer.parseInt(components[0]);
            num2 = Integer.parseInt(components[2]);
        } catch (RuntimeException e) {
            throw new RuntimeException("введенные числа не являются целыми");
        }
        if (num1 < 0 || num2 < 0) {
            throw new RuntimeException("введенные числа должны быть положительными");
        }
        char sign;
        try {
            sign = components[1].charAt(0);
        } catch (RuntimeException e) {
            //кидает если ввести 5  5 (число, два пробела и опять число)
            throw new RuntimeException("необходимо указать знак математической операции");
        }
        return switch (sign) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> {
                checkingZero(num2);
                yield (double) num1 / num2;
            }
            case '%' -> {
                checkingZero(num2);
                yield num1 % num2;
            }
            case '^' -> Math.pow(num1, num2);
            default -> throw new RuntimeException("знак " + sign + " не поддерживается");
        };
    }

    private static void checkingZero(int number) {
        if (number == 0) {
            throw new RuntimeException("нельзя делить на 0");
        }
    }
}
