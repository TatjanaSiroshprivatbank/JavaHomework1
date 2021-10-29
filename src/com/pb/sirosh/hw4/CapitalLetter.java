package com.pb.sirosh.hw4;


import java.util.Scanner;

public class CapitalLetter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = scan.nextLine();
        change(str);
    }

    public static void change(String str) {
        //System.out.print("Введенная строка: " + str); // для отладки программы
        //преобразовываем строку в массив
        char[] chArray = str.toCharArray();
        //перебираем все элементы массива
        //преобразовываем первый элемент массива
        if (Character.isLetter(chArray[0])) {
            chArray[0] = Character.toUpperCase(chArray[0]);
        }
        //преобразовываем последний элемент массива
        if (chArray[chArray.length-2] == ' ' && Character.isLetter(chArray[chArray.length-1])) {
            chArray[chArray.length-1] = Character.toUpperCase(chArray[chArray.length-1]);
        }
        for (int i = 0; i < chArray.length-1; i++) {
            //находим пробел
            if (chArray[i] == ' ') {
            //заменяем следующий символ за пробелом на заглавную букву
                chArray[i+1] = Character.toUpperCase(chArray[i+1]);
            }
        }
        //выводим результат
        System.out.print("Преобразованный массив: " + "\n");
        System.out.println(chArray);
    }
}







//System.out.println("Символ \\t это пустое пространство: " + Character.isWhitespace('\t'));
//        System.out.println("Верхний регистр символа а: " + Character.toUpperCase('а'));
//        System.out.println("Нижний регистр символа А: " + Character.toLowerCase('А'));


//    private static void concatPlus() {
//        String s = "";
//        for (int i = 0; i < 10_000; i++) {
//            s = s + "a";
//        }
//        System.out.println("concatPlus длинна строки: " + s.length());
//    }