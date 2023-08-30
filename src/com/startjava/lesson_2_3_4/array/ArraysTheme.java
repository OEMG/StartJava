package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArraysTheme {
    public static void main(String[] args) {
        ArraysTheme.reverseArray();
        ArraysTheme.calculateArray();
        ArraysTheme.removeFromArray();
        ArraysTheme.alphabetLadder();
        ArraysTheme.fillWithUniqueNumbers();
    }

    public static void reverseArray() {
        System.out.println("1. Реверс значений массива");
        int[] num = {1, 7, 4, 5, 2, 6, 3};
        System.out.println("   До реверса: " + Arrays.toString(num));
        for (int i = 0; i < num.length / 2; i++) {
            int backIndex = num.length - i - 1;
            int temp = num[i];
            num[i] = num[backIndex];
            num[backIndex] = temp;
        }
        System.out.println("После реверса: " + Arrays.toString(num));
    }

    public static void calculateArray() {
        System.out.println("\n2. Произведение элементов массива");
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = i;
        }
        int result = 1;
        for (int i = 1; i < num.length - 1; i++) {
            result *= i;
            System.out.print((num.length - 2 > i) ? (i + " * ") : (i + " = " + result));
        }
    }

    public static void removeFromArray() {
        System.out.println("\n\n3. Удаление элементов массива");
        double[] num = new double[15];
        int len = num.length;
        for (int i = 0; i < len; i++) {
            num[i] = Math.random();
        }
        printArray(num);
        System.out.println();
        int zeroCount = 0;
        for (int i = 0; i < len; i++) {
            if (num[i] > num[len / 2]) {
                num[i] = 0;
                zeroCount++;
            }
        }
        printArray(num);
        System.out.println("\nКоличество нулей " + zeroCount);
    }

    public static void alphabetLadder() {
        System.out.println("\n4. Вывод алфавита лесенкой");
        char[] letters = new char[26];
        int len = letters.length;
        int i = 0;
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            letters[i++] = ch;
        }
        for (i = len - 1; i >= 0; i--) {
            for (int j = len - 1; j >= i; j--) {
                System.out.print(letters[j]);
            }
            System.out.println();
        }
    }

    public static void fillWithUniqueNumbers() {
        System.out.println("\n5. Заполнение массива уникальными числами");
        int[] num = new int[30];
        int len = num.length;
        //Заполняем массив и сразу проверяем на уникальность
        for (int i = 0; i < len; i++) {
            int temp = (int) (Math.random() * 40 + 60);
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (num[j] == temp) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                num[i] = temp;
            } else {
                i--;
            }
        }
        //Сортировка пузырьком
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        //Вывод по 10 значений в строке
        for (int i = 0; i < len; i++) {
            System.out.print(num[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }

    private static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 8) {
                System.out.println();
            }
            System.out.printf("%.3f ", array[i]);
        }
    }


}
