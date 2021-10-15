package com.pb.sirosh.hw2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;

        System.out.print("Введите первое целое число a: ");
        operand1 = scan.nextInt();
        System.out.print("Введите второе целое число b: ");
        operand2 = scan.nextInt();
        System.out.print("Введите знак арифметической операции (+,-,*,/): ");
        sign = scan.next();

        switch (sign) {
            case "+":
                System.out.println("a + b = " + (operand1 + operand2));
                break;
            case "-":
                System.out.println("a - b = " + (operand1 - operand2));
                break;
            case "*":
                System.out.println("a * b = " + (operand1 * operand2));
                break;
            case "/":
                if (operand2 != 0) {
                    //double result = operand1 / operand2;
                    System.out.println("a / b = " + ((double)operand1 / operand2));
                } else {
                    System.out.print("На ноль делить нельзя");
                }
                break;
            default:
                System.out.println("Задан оператор, не из списка +,-,*,/");
        }

    }
}