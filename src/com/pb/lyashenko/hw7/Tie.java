package com.pb.lyashenko.hw7;

public class Tie extends Clothes implements  ManClothes{
    public Tie(Size size, float price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина одевает галстук " + getInfo());
    }
}
