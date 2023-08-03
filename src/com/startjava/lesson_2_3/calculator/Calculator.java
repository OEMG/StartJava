package com.startjava.lesson_2_3.calculator;

public class Calculator {
    
    private int num1;
    private int num2;
    private char sign;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public int calculate() {
        if (num2 == 0 && sign == '/') {
            System.out.println("Делить на ноль нельзя");
            return 0;
        }
        return switch (sign) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num1 / num2;
            case '%' -> num1 % num2;
            case '^' -> (int) Math.pow(num1, num2);
            default -> {
                System.out.println("Недопустимая операция");
                yield 0;
            }
        };
    }
}