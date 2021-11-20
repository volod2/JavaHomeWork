package com.pb.lyashenko.hw7;

abstract class Clothes {
    //Clothes (одежда) содержащий переменные размер (типа Size), стоимость, цвет.
    private Size size;
    private float price;
    private String color;

    public Clothes(Size size, float price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public float getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
    public  String getInfo(){
        return "размер" + size.name() + size.getEuroSize() + size.getDescription();
    }
}
