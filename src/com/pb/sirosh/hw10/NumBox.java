package com.pb.sirosh.hw10;

public class NumBox<T extends Number> {
    private final T[] numbers;

    @SuppressWarnings("unchecked")
    public NumBox(int size) { //конструктор принимающий параметр - максимальную длину массива


        numbers = (T[]) new Number[size];
    }

    public T get(int index) { //получить элемент из массива по индексу
        return numbers[index];
    }

    public void add(int index, T number) throws ArrayIndexOutOfBoundsException {  //добавляющий число в массив
        if (index > numbers.length) {
            throw new ArrayIndexOutOfBoundsException();
        } else this.numbers[index] = number;
    }

    public int length() { //возвращает текущее количество элементов
            int i = 0;
            for(T n : numbers){
                if(n == null){
                    break;
                }
                i++;
                if (i== numbers.length){
                   break;
                }
            }
            return i;
    }

    public double sum() { // сумма элементов массива
            double sum = 0.0;
            for(T i : numbers){
                if(i == null){
                    sum+=0;
                } else sum+=i.doubleValue();
            }
            return sum;
        }

    public double average(){  //подсчет среднего арифметического среди элементов массива
        double avr = (sum()/length());
        return avr;
    }


    public T max() {    //максимальный элемент массива
        T maximum = numbers[0];
        for (T i : numbers) {
            if (i == null) {
                break;   }
            else if (i.doubleValue() > maximum.doubleValue()) {
                maximum = i;
            }
        }
        return maximum;
    }

}
