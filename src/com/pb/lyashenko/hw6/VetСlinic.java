package com.pb.lyashenko.hw6;

import java.lang.reflect.Constructor;

public class VetСlinic {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Dog("meat", "home", true),
                new Cat("milk", "home", true),
                new Horse("oats", "prerea", true)};

        //Veterinarian veterinarian = null;
        Class vet = null;
        try {
            vet = Class.forName("com.pb.lyashenko.hw6.Veterinarian");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Object v = vet.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        for (Animal a : animals) {
            v.treatAnimal(a);
        }
    }
}

