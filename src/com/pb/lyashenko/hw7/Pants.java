package com.pb.lyashenko.hw7;

public class Pants extends Clothes implements ManClothes, WomenClothes{
    public Pants(Size size, float price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина одевает штаны " + getInfo());
    }
    @Override
    public void dressWomen() {
        System.out.println("Женщина одевает штаны " + getInfo());
    }
}
