package com.pb.sirosh.hw4;
import java.util.Scanner;
import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String str1 = scan.nextLine();
        System.out.println("Введите вторую строку: ");
        String str2 = scan.nextLine();
        if (counter(str1, str2) == false) {
            System.out.print("Введенные строки не являются анаграммой" + "\n");
        }
        else {
            System.out.print("Введенные строки являются анаграммой" + "\n");
        }
    }

    public static boolean counter (String str1, String str2) {
        //System.out.print("Введенная строка1: " + str1 + "\n"); // для отладки программы
        //System.out.print("Введенная строка2: " + str2 + "\n"); // для отладки программы
        if (str1.length() != str2.length()) {
            //System.out.print("Введенные строки не являются анаграммой" + "\n");
            return false;
        }

        char[] str1_array = str1.toCharArray();
        char[] str2_array = str2.toCharArray();
        Arrays.sort(str1_array);
        Arrays.sort(str2_array);
        String sorted_str1 = new String(str1_array);
        String sorted_str2 = new String(str2_array);
        Boolean result = Arrays.equals(str1_array, str2_array);
       // System.out.println(str1_array); // для отладки программы
       // System.out.println(str2_array); // для отладки программы
       // System.out.println(result); // для отладки программы

        return result;
    }




//    public static void change(String str1, String str2) {
//        System.out.print("Введенная строка: " + str1); // для отладки программы
//        System.out.print("Введенная строка: " + str2); // для отладки программы
//
//
//
//        //выводим результат
//        System.out.print("Преобразованный массив: " + "\n");
//        System.out.println(chArray);
//    }
}

