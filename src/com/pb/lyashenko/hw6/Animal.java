package com.pb.lyashenko.hw6;

public class Animal {
    //переменные food, location и методы makeNoise, eat, sleep.
    //Метод sleep, например, может выводить на консоль "Такое-то животное спит".
    //Dog, Cat, Horse переопределяют методы makeNoise, eat.
    private String food = "";
    private String location = "";

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public void makeNoise() {
        System.out.println("Животное издает звук");
    }

    public void eat() {
        System.out.println("Животное ест");
    }

    public void  sleep() {
        System.out.println("Животное спит");
    }

}

