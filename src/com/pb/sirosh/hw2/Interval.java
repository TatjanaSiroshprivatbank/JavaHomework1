package com.pb.sirosh.hw2;
import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        System.out.print("Введите целое число от 0 до 100: ");
        a = scan.nextInt();

        if (a >= 0 && a <= 14) {
            System.out.print("Значение числа в диапазоне [0 - 14]");
        } else if (a >= 15 && a <= 35) {
            System.out.print("Значение числа в диапазоне [15 - 35]");
        } else if (a >= 36 && a <= 50) {
            System.out.print("Значение числа в диапазоне [36 - 50]");
        } else if (a >= 51 && a <= 100) {
            System.out.print("Значение числа в диапазоне [51 - 100]");
        } else {
            System.out.print("Ввeденное число не входит в диапазон от 1 до 100");
        }
    }
}
