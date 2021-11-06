package com.pb.sirosh.hw6;

import java.util.Objects;

public class Cat extends Animal {
    private String name_of_cat;

    public Cat() {
    }

    public Cat(String food, String location) {
        super(food, location);
    }

    public String getName_of_cat() {
        return name_of_cat;
    }

    public void setName_of_cat(String name_of_cat) {
        this.name_of_cat = name_of_cat;
    }

    @Override
    public String eat() {
        System.out.println("Кошка ест");
        return null;
    }

    @Override
    public void makeNoise() {
        System.out.println("Мяу");;
    }

    @Override
    public String toString() {
        return "Кот ест " + getFood() + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(name_of_cat, cat.name_of_cat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name_of_cat);
    }
}
