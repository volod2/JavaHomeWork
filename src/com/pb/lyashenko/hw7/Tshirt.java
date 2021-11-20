package com.pb.lyashenko.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes{
    public Tshirt(Size size, float price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина одевает футболку " + getInfo());
    }
    @Override
    public void dressWomen() {
        System.out.println("Женщина одевает футболку "  + getInfo());
    }
}
