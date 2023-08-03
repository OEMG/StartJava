package com.startjava.lesson_1.base;

public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел\n");
        int sumEven = 0;
        int sumOdd = 0;
        int startInterval = -10;
        int endInterval = 21;
        do {
            if (startInterval % 2 == 0) {
                sumEven += startInterval;
            } else {
                sumOdd += startInterval;
            }
            startInterval++;
        } while (startInterval <= endInterval);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEven + 
                ", а нечетных = " + sumOdd);

        System.out.println("\n\n2.Вывод чисел в интервале (min и max) в порядке убывания\n");
        int max = 10;
        int min = 5;
        int someNumber = -1;
        if (max > min) {
            min = max;
            max = min;
        } else {
            min = min;
            max = max;
        }
        if (someNumber > min) {
            min = min;
        } else if (someNumber < max) {
            max = someNumber;
        }
        for (int i = min - 1; i > max; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3.Вывод реверсивного числа и суммы его цифр\n");
        int number1 = 1234;
        int countDigits = 1;
        int multiplier = 1;
        int sumDigits = 0;
        int calculation = 0;
        while (countDigits < 5) {
            calculation = number1 % (multiplier * 10) / multiplier;
            System.out.print(calculation);
            sumDigits += calculation;
            multiplier *= 10;
            countDigits++;
        }
        System.out.print("\n" + sumDigits);

        System.out.println("\n\n4.Вывод чисел на консоль в несколько строк\n");
        int startSegment = 1;
        int endSegment = 24;
        int countNumbers = 1;
        int countZeros = 5;
        for (int i = startSegment; i < endSegment; i += 2) {
            if (countNumbers % 5 != 0) {
                System.out.printf("%4d", i);
                if (countZeros == 0) {
                    countZeros = 4;
                } else {
                    countZeros--;
                }
            } else {
                System.out.printf("%4d\n", i);
                countZeros = 0;
            }
            countNumbers++;
        }
        for (int i = 0; i < countZeros; i++) {
            System.out.printf("%4d", 0);
        }

        System.out.println("\n\n5.Проверка количества двоек на четность/нечетность\n");
        int number2 = 3242592;
        int countDigits2 = 1;
        int multiplier2 = 1;
        int countTwos = 0;
        while (countDigits2 < 8) {
            if (number2 % (multiplier2 * 10) / multiplier2 == 2) {
                countTwos++;
            }
            multiplier2 *= 10;
            countDigits2++;
        }
        if (countTwos % 2 == 0) {
            System.out.println("Число " + number2 + " содержит " + countTwos +
                    " (четное) количество двоек");
        } else {
            System.out.println("Число " + number2 + " содержит " + countTwos +
                    " (нечетное) количество двоек");
        }

        System.out.println("\n\n6.Отображение фигур в консоли\n");
        int line = 5;
        for (int i = 0; i < 5; i++) {
            System.out.println("**********");
        }

        while(line > 0) {
            int column = line;
            while (column > 0) {
                System.out.print("#");
                column--;
            }
            System.out.println();
            line--;
        }
        
        int countRows = 1;
        int maxCountRows = 5;
        int maxCountSymbols = 3;
        do {
            if(countRows <= 3) {
                System.out.printf("%1." + countRows + "s\n", "$$$");
            } else {
                maxCountSymbols--;
                System.out.printf("%1." + maxCountSymbols + "s\n", "$$$");
            }
            countRows++;
        } while(countRows <= maxCountRows);

        System.out.println("\n\n7.Отображение ASCII-символов\n");
        System.out.printf("%7s%10s\n", "DECIMAL", "CHARACTER");
        for (int i = 0; i < 127; i++) {
            if (i >= 33 && i <= 47 && i % 2 != 0) {
                System.out.printf("%7d%10c\n", i, i);
            }
            if (i >= 97 && i <= 122 && i % 2 == 0) {
                System.out.printf("%7d%10c\n", i, i);
            }
        }

        System.out.println("\n\n8.Проверка, является ли число палиндромом\n");
        int number6 = 1234321;
        int reverse = 0;
        int original = number6;
        while (number6 != 0) {
            int digit = number6 % 10;
            reverse = reverse * 10 + digit;
            number6 /= 10;
        }
        if (original == reverse) {
            System.out.println("Число " + original + " является палиндромом");
        } else {
            System.out.println("Число " + original + " не является палиндромом");
        }

        System.out.println("\n\n9.Определение, является ли число счастливым\n");
        int luckyNumber = 123321;
        int right = 0;
        int left = 0;
        int calculation2 = 0;
        for (int i = 1, j = 1; i <= 6; i++, j *= 10) {
            calculation2 = luckyNumber % (j * 10) / j;
            if (i < 4) {
                right += calculation;
            } else {
                left += calculation;
            }
        }
        System.out.println("Сумма цифр " + luckyNumber % 1000 + " = " + right);
        System.out.println("Сумма цифр " + luckyNumber / 1000 + " = " + left);
        if (right == left) {
            System.out.println("Число " + luckyNumber + " счастливое");
        } else {
            System.out.println("Число " + luckyNumber + " несчастливое");
        }

        System.out.println("\n\n10.Вывод таблицы умножения Пифагора\n");
        int column = 10;
        int row = 10;
        System.out.printf("%3s%2c", "", '|');
        for (int i = 2; i < column; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        for (int i = 1; i < column * 3; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 2; i < column; i++) {
            for (int j = 1; j < row; j++) {
                if (j == 2) {
                    System.out.print(" |");
                }
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}