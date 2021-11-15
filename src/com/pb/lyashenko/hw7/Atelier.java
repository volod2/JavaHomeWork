package com.pb.lyashenko.hw7;

public class Atelier {
    public static void main(String[] args) {
        Tshirt t = new Tshirt();
        Clothes[] clothes = new Clothes[]{new Tshirt(), new Pants(), new Skirt(), new Tie()};

    }

    public static dressman(Clothes[] clothes) {
        System.out.println("Мужская одежда:");
        for (Clothes item : clothes) {
            if (item instanceof Pants || item instanceof Tshirt || item instanceof Tie) {
                item.dressman();
            }

        }
    }

    public static dressWomen(Clothes[] clothes){
        System.out.println("Женская одежда:");
        for (Clothes item : clothes) {
            if (item instanceof Pants || item instanceof Tshirt || item instanceof Tie) {
                item.dressman();
            }

        }
    }
}