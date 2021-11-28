package com.pb.sirosh.hw10;

public class Main {

    public static void main(String[] args) {
        NumBox<Float> numberfloat = new NumBox<>(3);
        numberfloat.add(0, new Float(1.1F));
        numberfloat.add(1, new Float(1.3F));
        numberfloat.add(2, new Float(12.2F));
        Float numberfloat1 = numberfloat.get(0);
        Float numberfloat2 = numberfloat.get(1);
        Float numberfloat3 = numberfloat.get(2);
        System.out.println("Элементы массива float: ");
        System.out.println(numberfloat1);
        System.out.println(numberfloat2);
        System.out.println(numberfloat3);
        System.out.println("Количество элементов массива: " + numberfloat.length());
        System.out.println("Максимальный элемент массива: " + numberfloat.max());
        System.out.println("Среднее значение элементов массива: " + numberfloat.average());
        System.out.println("Сумма элементов массива: " + numberfloat.sum());

        NumBox<Integer> numberint = new NumBox<>(3);
        numberint.add(0, new Integer(1));
        numberint.add(1, new Integer(10));
        numberint.add(2, new Integer(3));
        Integer numberint1 = numberint.get(0);
        Integer numberint2 = numberint.get(1);
        Integer numberint3 = numberint.get(2);
        System.out.println("Элементы массива int: ");
        System.out.println(numberint1);
        System.out.println(numberint2);
        System.out.println(numberint3);
        System.out.println("Количество элементов массива: " + numberint.length());
        System.out.println("Максимальный элемент массива: " + numberint.max());
        System.out.println("Среднее значение элементов массива: " + numberint.average());
        System.out.println("Сумма элементов массива: " + numberint.sum());
    }

}
