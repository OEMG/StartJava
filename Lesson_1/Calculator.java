public class Calculator {

    public static void main(String[] args) {
        int firstNum = 2;
        int secondNum = 3;
        char sign = '^';
        int result = 0;
        if (sign == '+') {
            result = firstNum + secondNum;
        } else if (sign == '-') {
            result = firstNum - secondNum;
        } else if (sign == '*') {
            result = firstNum * secondNum;
        } else if (sign == '/') {
            result = firstNum / secondNum;
        } else if (sign == '%') {
            result = firstNum % secondNum;
        } else if (sign == '^') {
            result = 1;
            for (int i = 0; i < secondNum; i++) {
                result *= firstNum;
            }
        } else {
            System.out.println("Несуществующий математический знак");
        }
        System.out.println(firstNum + " " + sign + " " + secondNum + " = " + result);
    }
}