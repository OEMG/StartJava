public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java\n");
        int age = 31;
        boolean isMen = true;
        double height = 1.84;
        if (age > 20) {
            System.out.println("Возраст больше 20");
        } else {
            System.out.println("Возраст меньше 20");
        }
        if (!isMen) {
            System.out.println("Женщина");
        } else {
            System.out.println("Мужчина");
        }
        if (height < 1.80) {
            System.out.println("Человек невысокого роста");
        } else {
            System.out.println("Человек высокого роста");
        }
        char firstLetterName= "Anton".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Первая буква имени: " + firstLetterName);
        } else if(firstLetterName == 'I') {
            System.out.println("Первая буква имени: " + firstLetterName);
        } else {
            System.out.println("Первая буква имени: " + firstLetterName);
        }

        System.out.println("\n\n2. Поиск max и min числа\n");
        int num1 = 100;
        int num2 = 45;
        if (num1 > num2) {
            System.out.println("max - " + num1 + "\nmin - " + num2);
        } else if (num1 < num2) {
            System.out.println("max - " + num2 + "\nmin - " + num1);
        } else {
            System.out.println("Числа равны " + num1 + " = " + num2);
        }

        System.out.println("\n\n3. Проверка числа\n");
        int number = -5;
        if (number % 2 == 0) {
            if (number == 0) {
                System.out.println(number + " - задано число ноль");
            } else if (number < 0) {
                System.out.println(number + " - задано отрицательное четное число");
            } else {
                System.out.println(number + " - задано положительное четное число");
            }
        } else if (number % 2 == 1) {
            System.out.println(number + " - задано положительно нечетное число");
        } else {
            System.out.println(number + " - задано отрицательное нечетное число");
        }

        System.out.println("\n\n4. Поиск одинаковых цифр в числах\n");
        int number1 = 123;
        int number2 = 456;
        boolean active = (number1 % 10 == number2 % 10) || (number1 % 100 / 10 == number2 % 100 / 10) ||
                (number1 / 100 == number2 / 100);
        System.out.println("Первое число = " + number1 + "\nВторое число = " + number2);
        if (active) {
            if (number1 % 10 == number2 % 10) {
                System.out.println("Цифры " + number1 % 10 + " в двух числах равны. Разряд 1");
            }
            if (number1 % 100 / 10 == number2 % 100 / 10){
                System.out.println("Цифры " + number1 % 100 / 10 + " в двух числах равны. Разряд 2");
            }
            if (number1 / 100 == number2 / 100) {
                System.out.println("Цифры " + number1 / 100 + " в двух числах равны. Разряд 3");
            }
        } else {
            System.out.println("В числах все разряды разные");
        }

        System.out.println("\n\n5. Определение символа по его коду\n");
        char character = '\u0057';
        if (character >= '\u0030' && character <= '\u0039') {
            System.out.println(character + "-  число");
        } else if (character >= '\u0041' && character <= '\u005A') {
            System.out.println(character + " - большая буква");
        } else if (character >= '\u0061' && character <= '\u007A') {
            System.out.println(character + " - маленькая буква");
        } else {
            System.out.println(character + " - не буква и не число");
        }

        System.out.println("\n\n6. Подсчет суммы вклада и начисленных банком %\n");
        int deposit = 300_000;
        if (deposit < 100_000 && deposit > 0) {
            System.out.println("Сумма вклада: " + deposit);
            System.out.println("Начисленный %: " + (int) (deposit * 0.05));
            System.out.println("Итоговая сумма с %: " + (int) (deposit + deposit * 0.05));
        } else if (deposit > 300_000) {
            System.out.println("Сумма вклада: " + deposit);
            System.out.println("Начисленный %: " + (int) (deposit * 0.1));
            System.out.println("Итоговая сумма с %: " + (int) (deposit + deposit * 0.1));
        } else {
            System.out.println("Сумма вклада: " + deposit);
            System.out.println("Начисленный %: " + (int) (deposit * 0.07));
            System.out.println("Итоговая сумма с %: " + (int) (deposit + deposit * 0.07));
        }

        System.out.println("\n\n7. Определение оценки по предметам\n");
        int historyPercent = 59;
        int programmingPercent = 91;
        int historyGrade;
        int programmingGrade;
        if (historyPercent <= 60) {
            historyGrade = 2;
        } else if (historyPercent > 60 && historyPercent <= 73) {
            historyGrade = 3;
        } else if (historyPercent > 73 && historyPercent <= 91) {
            historyGrade = 4;
        } else {
            historyGrade = 5;
        }
        if (programmingPercent <= 60) {
            programmingGrade = 2;
        } else if (programmingPercent > 60 && programmingPercent <= 73) {
            programmingGrade = 3;
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            programmingGrade = 4;
        } else {
            programmingGrade = 5;
        }
        System.out.println(historyGrade + " - история | " + programmingGrade + " - программирование");
        System.out.println((historyGrade + programmingGrade) / 2 + " - средний балл");
        System.out.println((historyPercent + programmingPercent) / 2 + "% - средний процент");

        System.out.println("\n\n8. Расчет прибыли за год\n");
        int rent = 5_000;
        int sales = 13_000;
        int costPrice = 9_000;
        int profitMonth = sales - rent - costPrice;
        if (profitMonth * 12 > 0) {
            System.out.println("Прибыль за год: +" + profitMonth * 12 + " руб.");
        } else {
            System.out.println("Прибыль за год: " + profitMonth * 12 + " руб.");
        }

        System.out.println("\n\n9. Подсчет количества банкнот\n");
        int money = 567;
        int hundreds = 0;
        int tens = 0;
        int ones = 0;
        if (money > 1100) {
            System.out.println("В банкомате недостаточно банкнот. Введите сумму меньше.");
        } else if (money > 0) {
            if (money == 1100) {
                hundreds = 10;
                tens = 5;
                ones = 50;
            } else {
                hundreds = money / 100;
                if (money % 100 > 59) {
                    tens = 5;
                    ones = money % 100 - tens * 10;
                } else {
                    tens = money % 100 / 10;
                    ones = money % 100 % 10;
                }
            }
            System.out.println("Выдано банкнот:\n" + hundreds + " номиналом 100$\n" + tens + 
            " номиналом 10$\n" + ones + " номиналом 1$\nВыдана сумма: " + money + "$");
        } else {
            System.out.println("Число должно быть положительным, попробуйте снова.");
        }
    }
}