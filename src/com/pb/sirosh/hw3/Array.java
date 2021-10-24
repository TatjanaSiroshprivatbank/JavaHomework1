package com.pb.sirosh.hw3;
//package array;
import java.util.Scanner;
//package loop;

public class Array  {

    public static void main(String[] args) {

        // Заполнение массива.
        Scanner input = new Scanner(System.in);
        System.out.println("Заполните массив array целых чисел размерностью 10 элементов:");
        int[] array = new int[10];//создаем  массив размером 10
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt(); // заполняем массив с клавиатуры
        }

        // Вывод на экран значений элементов массива.
        System.out.println("Выводим на экран массив array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        // Вывод на экран суммы элементов массива.
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("\n" + "Сумма всех элементов массива array =  " + sum);

        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {  // находим количество положительных эленментов
                num++;
            }
        }
        System.out.println("Количество положительных элементов массива array =  " + num);


        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }

        // Вывод на экран значений элементов отсортированного массива.
        System.out.println("Выводим на экран отсортированный методом пузырька массив array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}



        //System.out.println("input mas len: ");
        //int x = scanner.nextInt();

       // String[] array = new String[x];



