package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private String[] expression;

    public void setExpression(String expression) {
        this.expression = expression.split(" ");
    }

    public double calculate() {
        int num1 = Integer.parseInt(expression[0]);
        char sign = expression[1].charAt(0);
        int num2 = Integer.parseInt(expression[2]);
        System.out.print(num1 + " " + sign + " " + num2 + " = ");
        return switch (sign) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> (double) num1 / num2;
            case '%' -> num1 % num2;
            case '^' -> Math.pow(num1, num2);
            default -> {
                System.out.println("Ошибка: знак " + sign + " не поддерживается");
                yield 0;
            }
        };
    }
}