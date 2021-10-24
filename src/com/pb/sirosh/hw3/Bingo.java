package com.pb.sirosh.hw3;
import java.util.Scanner;
import java.util.Random;

public class Bingo {
    // Циклическая конструкция - while.
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt(101); // Случайное задуманное число.

        System.out.println("Привет:) Я генератор случайных числел и загадал целое число от 0 до 100. Попробуй угадай его с моими подсказками :)");
        System.out.println("Если захочешь выйти из программы - введи exit");
        // System.out.println(x); Для отладки программы

        final int MAX_ATTEMPT = 101; // Допустимое количество попыток.
        int i = 0;           // Счетчик попыток.
        Scanner in = new Scanner(System.in);
        while (i < MAX_ATTEMPT) {
            i++;
            System.out.println("Попытка " + i + ":");
            String value = in.next();

            if (value.equals("exit")) {
                break;

            }
            try {
                int value1 = Integer.parseInt(value);
                }
            catch (NumberFormatException e) {
                System.err.println("Я же просил ввести число :)");
                continue;
                }
            int value1 = Integer.parseInt(value);
            if (value1 != x) {
                if (value1 < 0 || value1 > 100) {
                    System.out.print("Я просил ввести число от 0 до 100. Попробуй еще раз :)");
                }
                else if (value1 < x) {
                    System.out.println("Подсказка: я загадал большее число. Попробуй еще раз :)");
                }
                else if (value1 > x) {
                    System.out.println("Подсказка: я загадал меньшее число. Попробуй еще раз :)");
                }
                continue;
            }
            System.out.println("Поздравляю, ты угадал с " + i + " попытки!");
            break;
        }
        System.out.println("Конец игры!");
    }
}