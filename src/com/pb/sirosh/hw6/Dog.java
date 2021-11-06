package com.pb.sirosh.hw6;

import java.util.Objects;

public class Dog extends Animal {
    private String poroda_of_dog;

    public Dog() {
    }

    public Dog(String food, String location) {
        super(food, location);
    }

    public String getPoroda_of_dog() {
        return poroda_of_dog;
    }

    public void setPoroda_of_dog(String poroda_of_dog) {
        this.poroda_of_dog = poroda_of_dog;
    }

    @Override
    public String eat() {
        System.out.println("Собака ест");
        return null;
    }

    @Override
    public void makeNoise() {
        System.out.println("Гав");
    }

    @Override
    public String toString() {
        return "Собака ест " + getFood() + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(poroda_of_dog, dog.poroda_of_dog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), poroda_of_dog);
    }
}
