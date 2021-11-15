package com.pb.lyashenko.hw7;

public enum Size {
    XXS("Детский размер", 36),
    XS("Взрослый размер", 38),
    S("Взрослый размер", 40),
    M("Взрослый размер", 42),
    L("Взрослый размер", 44)
    ;
    private String description;
    private int euroSize;


     Size(String description, int euroSize){
        this.description = description;
        this.euroSize = euroSize;
    }
    public void getEuroSize(String euroSize){
        if (euroSize.equals("XXS")){
            System.out.println(XXS.description);
        }
        else {
            System.out.println(XS.description);
        }
    }
    public int getSize(String Size){
        //Так же перечисление должно иметь метод getEuroSize() возвращающий числовое значение (32, 34, 36, 38, 40)
        //соответствующее каждому размеру.
    }
}
