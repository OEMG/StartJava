public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java\n");
        int age = 31;
        if (age > 20) {
            System.out.println("Возраст больше 20");
        } else {
            System.out.println("Возраст меньше 20");
        }
        boolean maleGender = true;
        if (!maleGender) {
            System.out.println("Женщина");
        } else {
            System.out.println("Мужчина");
        }
        double height = 1.84;
        if (height < 1.80) {
            System.out.println("Человек невысокого роста");
        } else {
            System.out.println("Человек высокого роста");
        }
        char firstLetterName = "Anton".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Первая буква имени: " + firstLetterName);
        } else if(firstLetterName == 'I') {
            System.out.println("Первая буква имени: " + firstLetterName);
        } else {
            System.out.println("Первая буква имени: " + firstLetterName);
        }

        System.out.println("\n\n2. Поиск max и min числа\n");
        int number1 = 100;
        int number2 = 45;
        if (number1 > number2) {
            System.out.println("max - " + number1 + "\nmin - " + number2);
        } else if (number1 < number2) {
            System.out.println("max - " + number2 + "\nmin - " + number1);
        } else {
            System.out.println("Числа равны " + number1 + " = " + number2);
        }

        System.out.println("\n\n3. Проверка числа\n");
        int number3 = 7;
        if (number3 != 0) {
            if (number3 % 2 == 0) {
                if (number3 > 0) {
                    System.out.println(number3 + " - задано положительное четное число");
                } else {
                    System.out.println(number3 + " - задано отрицательное четное число");
                }
            } else {
                if (number3 > 0) {
                    System.out.println(number3 + " - задано положительно нечетное число");
                } else {
                    System.out.println(number3 + " - задано отрицательное нечетное число");
                }
            }
        } else {
            System.out.println(number3 + " - задано число ноль");
        }

        System.out.println("\n\n4. Поиск одинаковых цифр в числах\n");
        int number4 = 123;
        int number5 = 183;
        boolean isFirstDigitsEqual = number4 % 10 == number5 % 10;
        boolean isSecondDigitsEqual = number4 % 100 / 10 == number5 % 100 / 10;
        boolean isThirdDigitsEqual = number4 / 100 == number5 / 100;
        System.out.println("Первое число = " + number4 + "\nВторое число = " + number5);
        if (isFirstDigitsEqual || isSecondDigitsEqual || isThirdDigitsEqual) {
            if (isFirstDigitsEqual) {
                System.out.println("Цифры " + number4 % 10 + " в двух числах равны. Разряд 1");
            }
            if (isSecondDigitsEqual){
                System.out.println("Цифры " + number4 % 100 / 10 + " в двух числах равны. Разряд 2");
            }
            if (isThirdDigitsEqual) {
                System.out.println("Цифры " + number4 / 100 + " в двух числах равны. Разряд 3");
            }
        } else {
            System.out.println("В числах все разряды разные");
        }

        System.out.println("\n\n5. Определение символа по его коду\n");
        char code = '\u0057';
        if (code >= '0' && code <= '9') {
            System.out.println(code + " - число");
        } else if (code >= 'A' && code <= 'Z') {
            System.out.println(code + " - большая буква");
        } else if (code >= 'a' && code <= 'z') {
            System.out.println(code + " - маленькая буква");
        } else {
            System.out.println(code + " - не буква и не число");
        }

        System.out.println("\n\n6. Подсчет суммы вклада и начисленных банком %\n");
        int deposit = 300_000;
        double interestRate = 0.07;
        if (deposit < 100_000 && deposit > 0) {
            interestRate = 0.05;
        } else if (deposit > 300_000) {
            interestRate = 0.1;
        }
        System.out.println("Сумма вклада: " + deposit);
        System.out.println("Начисленный %: " + (int) (deposit * interestRate));
        System.out.println("Итоговая сумма с %: " + (int) (deposit + deposit * interestRate));

        System.out.println("\n\n7. Определение оценки по предметам\n");
        int historyPercent = 59;
        int historyGrade = 5;
        if (historyPercent <= 60) {
            historyGrade = 2;
        } else if (historyPercent > 60 && historyPercent <= 73) {
            historyGrade = 3;
        } else if (historyPercent > 73 && historyPercent <= 91) {
            historyGrade = 4;
        }
        int programmingPercent = 91;
        int programmingGrade = 5;
        if (programmingPercent <= 60) {
            programmingGrade = 2;
        } else if (programmingPercent > 60 && programmingPercent <= 73) {
            programmingGrade = 3;
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            programmingGrade = 4;
        }
        System.out.println(historyGrade + " - история | " + programmingGrade + " - программирование");
        System.out.println((historyGrade + programmingGrade) / 2 + " - средний балл");
        System.out.println((historyPercent + programmingPercent) / 2 + "% - средний процент");

        System.out.println("\n\n8. Расчет прибыли за год\n");
        int rent = 5_000;
        int sales = 13_000;
        int costPrice = 9_000;
        int profitAnnual = (sales - rent - costPrice) * 12;
        if (profitAnnual > 0) {
            System.out.println("Прибыль за год: +" + profitAnnual + " руб.");
        } else {
            System.out.println("Прибыль за год: " + profitAnnual + " руб.");
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