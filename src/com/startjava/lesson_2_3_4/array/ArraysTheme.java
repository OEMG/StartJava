package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArraysTheme {
    public static void main(String[] args) {
        reverseArray();
        multiplyNumbers();
        removeFromArray();
        showAlphabetLadder();
        fillWithUniqueNumbers();
    }

    public static void reverseArray() {
        System.out.println("1. Реверс значений массива");
        int[] numbers = {1, 7, 4, 5, 2, 6, 3};
        System.out.println("   До реверса: " + Arrays.toString(numbers));
        int len = numbers.length;
        for (int i = 0; i <= len / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[--len];
            numbers[len] = temp;
        }
        System.out.println("После реверса: " + Arrays.toString(numbers));
    }

    public static void multiplyNumbers() {
        System.out.println("\n2. Произведение элементов массива");
        int[] multipliers = new int[10];
        int len = multipliers.length;
        for (int i = 0; i < len; i++) {
            multipliers[i] = i;
        }
        int result = 1;
        for (int i = 1; i < len - 1; i++) {
            result *= multipliers[i];
            System.out.print(multipliers[i]);
            System.out.print((len - 2 > i) ? (" * ") : (" = " + result));
        }
    }

    public static void removeFromArray() {
        System.out.println("\n\n3. Удаление элементов массива");
        double[] randomNumbers = new double[15];
        int len = randomNumbers.length;
        for (int i = 0; i < len; i++) {
            randomNumbers[i] = Math.random();
        }
        printArray(randomNumbers);
        int countZeros = 0;
        double middleElement = randomNumbers[len / 2];
        for (int i = 0; i < len; i++) {
            if (randomNumbers[i] > middleElement) {
                randomNumbers[i] = 0;
                countZeros++;
            }
        }
        printArray(randomNumbers);
        System.out.println("Количество нулей " + countZeros);
    }

    public static void showAlphabetLadder() {
        System.out.println("\n4. Вывод алфавита лесенкой");
        char[] alphabet = new char[26];
        int len = alphabet.length;
        for (int i = 0; i < len; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        for (int i = len - 1; i >= 0; i--) {
            for (int j = len - 1; j >= i; j--) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }
    }

    public static void fillWithUniqueNumbers() {
        System.out.println("\n5. Заполнение массива уникальными числами");
        int[] uniqueNumbers = new int[30];
        int len = uniqueNumbers.length;
        //Заполняем массив и сразу проверяем на уникальность
        for (int i = 0; i < len; i++) {
            int temp = (int) (Math.random() * 40 + 60);
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (uniqueNumbers[j] == temp) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueNumbers[i] = temp;
            } else {
                i--;
            }
        }
        //Сортировка пузырьком
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (uniqueNumbers[j] > uniqueNumbers[j + 1]) {
                    int temp = uniqueNumbers[j];
                    uniqueNumbers[j] = uniqueNumbers[j + 1];
                    uniqueNumbers[j + 1] = temp;
                }
            }
        }
        //Вывод по 10 значений в строке
        for (int i = 0; i < len; i++) {
            System.out.print(uniqueNumbers[i] + " ");
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
        System.out.println();
    }
}
