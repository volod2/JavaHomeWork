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
            vet = Class.forName("hw6.Veterinarian");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Constructor<Veterinarian> constructor = vet.getConstructor(new Class[]{});
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            Object o = vet.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        for (Animal a : animals) {
            //veterinarian.treatAnimal(a);


        }
    }
}
