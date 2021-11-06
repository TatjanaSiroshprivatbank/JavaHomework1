package com.pb.sirosh.hw6;

public class VetСlinic {

    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Корм", "Двор частного дома");
        animals[1] = new Cat("Молоко", "Дом");
        animals[2] = new Horse("Сено", "Ферма");

        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
    }
}
