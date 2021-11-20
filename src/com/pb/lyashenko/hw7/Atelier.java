package com.pb.lyashenko.hw7;

public class Atelier {
    public static void main(String[] args) {

        Clothes[] clothes = new Clothes[] {
                new Tshirt(Size.S, 30f, "Желтый"),
                new Pants(Size.L, 40f, "Белый"),
                new Skirt(Size.S, 22f, "Синий"),
                new Tie(Size.L, 44f, "Коричневій")
        };

        dressman(clothes);
        dressWomen(clothes);
    }

    public static void dressman(Clothes[] clothes) {
        System.out.println("Мужская одежда:");
        for (Clothes item : clothes) {
            if (item instanceof ManClothes) {
                ((ManClothes) item).dressMan();
            }

        }
    }

    public static void dressWomen(Clothes[] clothes){
            System.out.println("Женская одежда:");
            for (Clothes item : clothes) {
                if (item instanceof WomenClothes) {
                    ((WomenClothes) item).dressWomen();
                }
            }
        }
    }
