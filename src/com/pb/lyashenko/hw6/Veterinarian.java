package com.pb.lyashenko.hw6;

public class Veterinarian {
    public void treatAnimal(Animal animal) {
        System.out.println(animal.getFood()  + ", " + animal.getLocation());
    }
}
