package com.pb.lyashenko.hw6;

import java.util.Objects;

public class Cat extends Animal {
    private Boolean IsFur;

    public Cat(String food, String location, Boolean isFur) {
        super(food, location);
        IsFur = isFur;
    }

    @Override
    public void makeNoise() {
        //super.makeNoise();
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        //super.eat();
        System.out.println("Milk");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "IsFur='" + IsFur + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(IsFur, cat.IsFur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IsFur);
    }

}
