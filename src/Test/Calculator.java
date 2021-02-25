package Test;

import java.util.Scanner;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private String mathSign;
    Scanner scanner = new Scanner(System.in);

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setMathSign(String mathSign) {
        this.mathSign = mathSign;
    }

    public void computation() {
        System.out.println("Введите первое число:");
        setFirstNumber(scanner.nextInt());
        System.out.println("Введите знак математической операции: + - * / ^ %");
        setMathSign(scanner.next());
        System.out.println("Введите второе число:");
        setSecondNumber(scanner.nextInt());
    }

    public void calculate() {
        switch(mathSign) {
            case "+":
                System.out.println("Сумма чисел = " + (firstNumber + secondNumber));
                break;
            case "-":
                System.out.println("Разность чисел = " + (firstNumber - secondNumber));
                break;
            case "*":
                System.out.println("Произведение чисел = " + (firstNumber * secondNumber));
                break;
            case "/":
                if(secondNumber != 0) {
                    System.out.println("Деление числа " + firstNumber + " на число " + secondNumber + " = " + (firstNumber / secondNumber));
                } else {
                    System.out.println("Деление на 0 запрещено");
                }
                break;
            case "^":
//                int exp = firstNumber;
//                if(secondNumber > 1) {
//                    for(int i = 1; i < secondNumber ; i++) {
//                        exp *= firstNumber;
//                    }
                pow();
//                    System.out.println("Число " + firstNumber + " в степени " + secondNumber + " = " + exp);
//                } else if(secondNumber == 1) {
//                    System.out.println("Число в степени 1 равно самому себе и = " + firstNumber);
//                } else {
//                    System.out.println("Число возведенное в 0 степень = 1");
//                }
                break;
            case "%":
                if(secondNumber != 0) {
                    System.out.println("Остаток от деления числа " + firstNumber + " на число " + secondNumber + " = " + (firstNumber % secondNumber));
                } else {
                    System.out.println("Деление на 0 запрещено");
                }
                break;
            default:
                System.out.println("Вы ввели неправильный знак математической операции");
        }
    }
    private void pow() {
        int exp = 1;
        for(int i = 0; i < secondNumber ; i++) {
            exp *= firstNumber;
            }
        System.out.println("Число " + firstNumber + " в степени " + secondNumber + " = " + exp);
    }
}