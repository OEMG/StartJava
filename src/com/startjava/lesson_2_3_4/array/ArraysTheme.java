package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArraysTheme {
    public static void main(String[] args) {
        reverseArray();
        multiplicationNumbers();
        removeFromArray();
        showAlphabetLadder();
        fillWithUniqueNumbers();
    }

    public static void reverseArray() {
        System.out.println("1. Реверс значений массива");
        int[] unsorted = {1, 7, 4, 5, 2, 6, 3};
        System.out.println("   До реверса: " + Arrays.toString(unsorted));
        int len = unsorted.length;
        for (int i = 0; i < len / 2; i++) {
            int backIndex = len - i - 1;
            int temp = unsorted[i];
            unsorted[i] = unsorted[backIndex];
            unsorted[backIndex] = temp;
        }
        System.out.println("После реверса: " + Arrays.toString(unsorted));
    }

    public static void multiplicationNumbers() {
        System.out.println("\n2. Произведение элементов массива");
        int[] digits = new int[10];
        int len = digits.length;
        for (int i = 0; i < len; i++) {
            digits[i] = i;
        }
        int result = 1;
        for (int i = 1; i < len - 1; i++) {
            result *= digits[i];
            System.out.print(digits[i]);
            System.out.print((len - 2 > i) ? (" * ") : (" = " + result));
        }
    }

    public static void removeFromArray() {
        System.out.println("\n\n3. Удаление элементов массива");
        double[] random = new double[15];
        int len = random.length;
        for (int i = 0; i < len; i++) {
            random[i] = Math.random();
        }
        printArray(random);
        System.out.println();
        int countZero = 0;
        double midElement = random[len / 2];
        for (int i = 0; i < len; i++) {
            if (random[i] > midElement) {
                random[i] = 0;
                countZero++;
            }
        }
        printArray(random);
        System.out.println("\nКоличество нулей " + countZero);
    }

    public static void showAlphabetLadder() {
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
        int[] unique = new int[30];
        int len = unique.length;
        //Заполняем массив и сразу проверяем на уникальность
        for (int i = 0; i < len; i++) {
            int temp = (int) (Math.random() * 40 + 60);
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (unique[j] == temp) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                unique[i] = temp;
            } else {
                i--;
            }
        }
        //Сортировка пузырьком
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (unique[j] > unique[j + 1]) {
                    int temp = unique[j];
                    unique[j] = unique[j + 1];
                    unique[j + 1] = temp;
                }
            }
        }
        //Вывод по 10 значений в строке
        for (int i = 0; i < len; i++) {
            System.out.print(unique[i] + " ");
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
