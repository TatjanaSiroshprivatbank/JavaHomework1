package com.pb.sirosh.hw6;

import java.util.Objects;

public class Horse extends Animal {
    private String weight_of_horse;

    public Horse() {
    }

    public Horse(String food, String location) {
        super(food, location);
    }

    public String getWeight_of_horse() {
        return weight_of_horse;
    }

    public void setWeight_of_horse(String weight_of_horse) {
        this.weight_of_horse = weight_of_horse;
    }

    @Override
    public String eat() {
        return "Лошадь ест";
        //System.out.println("Лошадь ест");
    }

    @Override
    public void makeNoise() {
        System.out.println("Иго-го");
    }

    @Override
    public String toString() {
        return "Лошадь ест " + getFood() + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Horse horse = (Horse) o;
        return Objects.equals(weight_of_horse, horse.weight_of_horse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight_of_horse);
    }

}
