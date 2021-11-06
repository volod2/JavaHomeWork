package com.pb.lyashenko.hw6;

import java.util.Objects;

public class Horse extends Animal {
    private Boolean CanRide;

    public Horse(String food, String location, Boolean canRide) {
        super(food, location);
        CanRide = canRide;
    }

    @Override
    public void makeNoise() {
        System.out.println("igо-go");
    }

    @Override
    public void eat() {
        System.out.println("oats");
    }

    @Override
    public String toString() {
        return "Horse{" +
                "CanRide=" + CanRide +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Objects.equals(CanRide, horse.CanRide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CanRide);
    }
}
