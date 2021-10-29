package com.pb.sirosh.hw4;
//package string;


import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String in = scan.nextLine();
        System.out.println(in);
        print (in);
//        if (args.length > 0)  // если через консоль были введены аргументы
//            System.out.println(args[0]);  //то вывести на консоль первый элемент из массива
//
//        else {  //иначе —
//            //S14_MethodsMainOverload obj = new S14_MethodsMainOverload(); //создать объект
//            main(); // и использовать обычный метод с названием main()
//        }
    }

    public static void print (String in) {  // это обычный метод с названием main()
        System.out.println(in);

    }
}

