package com.pb.sirosh.hw6;

public class Veterinarian {
    public void treatAnimal(Animal animal) {
        System.out.println(animal);

      }
    }

//Попытка создать через рефлексию
//        public static void treatAnimal(String[] args) throws Exception {
//            Animal animal = new Animal();
//            Class clazz = animal.getClass();
//           // Class animal = Animal.class;
//            Class Animal = Class.forName("hw6.Animal");