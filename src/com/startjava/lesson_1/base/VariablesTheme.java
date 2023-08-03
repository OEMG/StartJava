package com.startjava.lesson_1.base;

public class VariablesTheme {
    
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера\n");
        byte cpuGeneration = 13;
        short cpuVersion = 13900;
        int cpuCacheMemory = 36_000_000;
        long cpuClockFrequency = 5_800_000_000L;
        float cpuCoreVoltage = 1.403f;
        double cpuMaxTemp = 101.5;
        char cpuIndex = 'i';
        boolean cpuCool = true;
        System.out.println("Поколение процессора: " + cpuGeneration);
        System.out.println("Версия: " + cpuVersion);
        System.out.println("Кэш память: " + cpuCacheMemory + " byte");
        System.out.println("Тактовая частота: " + cpuClockFrequency + " Hz");
        System.out.println("Напряжение ядра: " + cpuCoreVoltage + " V");
        System.out.println("Максимальная рабочая температура: " + cpuMaxTemp + "°C");
        System.out.println("Индекс: " + cpuIndex);
        System.out.println("Процессор крутой? - " + cpuCool);

        System.out.println("\n\n2. Расчет стоимости товара со скидкой\n");
        int penPrice = 100;
        int bookPrice = 200;
        int sum = penPrice + bookPrice;
        int discount = 11;
        System.out.println("Общая стоимость товаров без скидки: " + sum);
        System.out.println("Сумма скидки: " + sum * discount / 100);
        System.out.println("Общая стоимость товаров со скидкой: " + sum * (100 - discount) / 100);

        System.out.println("\n\n3. Вывод слова JAVA\n");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n\n4. Вывод min и max значений целых числовых типов\n");
        byte maxByte = 127;
        short maxShort = 32_767;
        int maxInt = 2_147_483_647;
        long maxLong = 9_223_372_036_854_775_807L;
        System.out.println("Значения byte:\n" + maxByte + "\n" + ++maxByte + "\n" + --maxByte);
        System.out.println("\nЗначения short:\n" + maxShort + "\n" + ++maxShort + "\n" + --maxShort);
        System.out.println("\nЗначения int:\n" + maxInt + "\n" + ++maxInt + "\n" + --maxInt);
        System.out.println("\nЗначения long:\n" + maxLong + "\n" + ++maxLong + "\n" + --maxLong);

        System.out.println("\n\n5. Перестановка значений переменных\n");
        int num1 = 2;
        int num2 = 5;
        System.out.println("\nС помощью третьей переменной:\n");
        System.out.println("Исходные значения: num1 = " + num1 + "; num2 = " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Новые значения: num1 = " + num1 + "; num2 = " + num2);
        System.out.println("\nС помощью арифметических операций:\n");
        System.out.println("Исходные значения: num1 = " + num1 + "; num2 = " + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("Новые значения: num1 = " + num1 + "; num2 = " + num2);
        System.out.println("\nС помощью побитовой операции ^ :\n");
        System.out.println("Исходные значения: num1 = " + num1 + "; num2 = " + num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("Новые значения: num1 = " + num1 + "; num2 = " + num2);

        System.out.println("\n\n6. Вывод символов и их кодов\n");
        char numberSign = '#';
        char ampersand = '&';
        char atSign = '@';
        char caret = '^';
        char underline = '_';
        System.out.println((int) numberSign + " - " + numberSign);
        System.out.println((int) ampersand + " - " + ampersand);
        System.out.println((int) atSign + " - " + atSign);
        System.out.println((int) caret + " - " + caret);
        System.out.println((int) underline + " - " + underline);

        System.out.println("\n\n7. Вывод в консоль ASCII-арт Дюка\n");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore + leftParenthesis + " " + rightParenthesis + 
                backslash);
        System.out.println(" "+ slash + "      " + backslash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + 
                slash + backslash + underscore + underscore + backslash);

        System.out.println("\n\n8. Вывод количества сотен, десятков и единиц числа\n");
        int number = 123;
        int hundreds = number / 100;
        int tens = number / 10 % 10;
        int ones = number % 10;
        System.out.println("Число " + number + " содержит:\n" + hundreds + " сотен\n" + 
                tens + " десятков\n" + ones + " единиц");
        System.out.println("Сумма его цифр = " + (hundreds + tens + ones));
        System.out.println("Произведение = " + (hundreds * tens * ones));

        System.out.println("\n\n9. Вывод времени\n");
        int numberSeconds = 86399;
        int hours = numberSeconds / 3600;
        int minutes = numberSeconds % 3600 / 60;
        int seconds = numberSeconds % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}