package com.pb.lyashenko.hw6;

import java.util.Objects;

public class Dog extends Animal {
    private Boolean isTail;

    public Dog(String food, String location, Boolean isTail) {
        super(food, location);
        this.isTail = isTail;
    }

    @Override
    public void makeNoise() {
        System.out.println("Gav");
    }

    @Override
    public void eat() {
        System.out.println("Meat");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "isTail=" + isTail +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(isTail, dog.isTail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isTail);
    }
}
