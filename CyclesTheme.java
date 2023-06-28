public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел\n");
        int sumEven = 0;
        int sumUneven = 0;
        int startInterval = -10;
        int endInterval = 21;
        do {
            if (startInterval % 2 == 0) {
                sumEven += startInterval;
                startInterval++;
            } else {
                sumUneven += startInterval;
                startInterval++;
            }
        } while (startInterval <= endInterval);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEven + 
                ", а нечетных = " + sumUneven);

        System.out.println("\n\n2.Вывод чисел в интервале (min и max) в порядке убывания\n");
        int number1 = 10;
        int number2 = 5;
        int number3 = -1;
        int minNumber;
        int maxNumber;
        if (number1 > number2) {
            maxNumber = number1;
            minNumber = number2;
        } else {
            maxNumber = number2;
            minNumber = number1;
        }
        if (number3 > maxNumber) {
            maxNumber = number2;
        } else if (number3 < minNumber) {
            minNumber = number3;
        }
        for (int i = maxNumber - 1; i > minNumber; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3.Вывод реверсивного числа и суммы его цифр\n");
        int number4 = 7856;
        int digitCounter = 1;
        int multiplier = 1;
        int sumDigits = 0;
        while (digitCounter < 5) {
            System.out.print(number4 % (multiplier * 10) / multiplier);
            sumDigits += number4 % (multiplier * 10) / multiplier;
            multiplier *= 10;
            digitCounter++;
        }
        System.out.print("\n" + sumDigits);

        System.out.println("\n\n4.Вывод чисел на консоль в несколько строк\n");
        int startSegment = 1;
        int endSegment = 24;
        int numberCounter = 1;
        int zeroCounter = 5;
        for (int i = startSegment; i < endSegment; i += 2) {
            if (numberCounter % 5 != 0) {
                System.out.printf("%4d", i);
                numberCounter++;
                if (zeroCounter == 0) {
                    zeroCounter = 4;
                } else {
                    zeroCounter--;
                }
            } else {
                System.out.printf("%4d\n", i);
                numberCounter++;
                zeroCounter = 0;
            }
        }
        for (int i = 0; i < zeroCounter; i++) {
            System.out.printf("%4d", 0);
        }

        System.out.println("\n\n5.Проверка количества двоек на четность/нечетность\n");
        int number5 = 3242592;
        int digitCounter2 = 1;
        int multiplier2 = 1;
        int counterTwos = 0;
        while (digitCounter2 < 8) {
            if (number5 % (multiplier2 * 10) / multiplier2 == 2) {
                counterTwos++;
            }
            multiplier2 *= 10;
            digitCounter2++;
        }
        if (counterTwos % 2 == 0) {
            System.out.println("Число " + number5 + " содержит " + counterTwos +
                    " (четное) количество двоек");
        } else {
            System.out.println("Число " + number5 + " содержит " + counterTwos +
                    " (нечетное) количество двоек");
        }

        System.out.println("\n\n6.Отображение фигур в консоли\n");
        for (int i = 1; i < 51; i++) {
            if (i % 10 != 0) {
                System.out.print("*");
            } else {
                System.out.println("*");
            }
        }
        int line = 5;
        while(line > 0) {
            int column = line;
            while (column > 0) {
                System.out.print("#");
                column--;
            }
            System.out.println("");
            line--;
        }
        int heightTriangle = 3;
        int dollarsPerLine = 1;
        int sptVar = 0;
        do {
            sptVar = dollarsPerLine;
            do {
                System.out.print("$");
                sptVar--;
            } while (sptVar > 0);
            System.out.println();
            dollarsPerLine++;
        } while (dollarsPerLine < heightTriangle);
        do {
            sptVar = dollarsPerLine;
            do {
                System.out.print("$");
                sptVar--;
            } while (sptVar > 0);
            System.out.println();
            dollarsPerLine--;
        } while (dollarsPerLine > 0);

        System.out.println("\n\n7.Отображение ASCII-символов\n");
        System.out.printf("%7s%10s\n", "DECIMAL", "CHARACTER");
        char code;
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
        for (int i = 1, j = 1, k = 1000000; i <= 7; i++, j *= 10, k /= 10) {
            reverse += number6 % (j * 10) / j * k;
        }
        if (number6 == reverse) {
            System.out.println("Число " + number6 + " является палиндромом");
        } else {
            System.out.println("Число " + number6 + " не является палиндромом");
        }

        System.out.println("\n\n9.Определение, является ли число счастливым\n");
        int luckyNumber = 123321;
        int sumFirstHalfDigits = 0;
        int sumSecondHalfDigits = 0;
        for (int i = 1, j = 1; i <= 6; i++, j *= 10) {
            if (i < 4) {
                sumFirstHalfDigits += luckyNumber % (j * 10) / j;
            } else {
                sumSecondHalfDigits += luckyNumber % (j * 10) / j;
            }
        }
        System.out.println("Сумма цифр " + luckyNumber % 1000 + " = " + sumFirstHalfDigits);
        System.out.println("Сумма цифр " + luckyNumber / 1000 + " = " + sumSecondHalfDigits);
        if (sumFirstHalfDigits == sumSecondHalfDigits) {
            System.out.println("Число " + luckyNumber + " счастливое");
        } else {
            System.out.println("Число " + luckyNumber + " несчастливое");
        }

        System.out.println("\n\n10.Вывод таблицы умножения Пифагора\n");
        int column = 10;
        int row = 10;
        for (int i = 1; i < column; i++) {
            for (int j = 1; j < row; j++) {
                if (j == 2) {
                    System.out.print(" |");
                }
                if (i * j > 1) {
                    System.out.printf("%3d", i * j);
                } else {
                    System.out.printf("%3s", "");
                }
            }
            if (i == 1) {
                System.out.println("");
                for (int k = 1; k < column * 3; k++) {
                    System.out.print("-");
                }
            }
            System.out.println("");
        }
    }
}