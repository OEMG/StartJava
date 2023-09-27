package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static double calculate(String expression) {
        String[] components = expression.split(" ");
        if (components.length != 3) {
            throw new RuntimeException("количество элементов должно быть 3");
        }
        int[] numbers = checkNumbers(components);
        int num1 = numbers[0];
        int num2 = numbers[1];
        char sign = checkSign(components);
        checkDivisor(sign, num2);
        return switch (sign) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> (double) num1 / num2;
            case '%' -> num1 % num2;
            case '^' -> Math.pow(num1, num2);
            default -> throw new RuntimeException("знак " + sign + " не поддерживается");
        };
    }

    private static int[] checkNumbers(String[] components) {
        int num1;
        int num2;
        try {
            num1 = Integer.parseInt(components[0]);
            num2 = Integer.parseInt(components[2]);
        } catch (RuntimeException e) {
            throw new RuntimeException("введенные числа не являются целыми");
        }
        if (num1 <= 0 || num2 < 0) {
            throw new RuntimeException("введенные числа должны быть положительными");
        }
        return new int[]{num1, num2};
    }

    private static char checkSign(String[] components) {
        char sign;
        try {
            sign = components[1].charAt(0);
        } catch (RuntimeException e) {
            throw new RuntimeException("необходимо указать знак математической операции");
        }
        return sign;
    }

    private static void checkDivisor(char sign, int divisor) {
        if ((sign == '/' || sign == '%') && divisor == 0) {
            throw new RuntimeException("нельзя делить на 0");
        }
    }
}
