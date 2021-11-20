package com.pb.lyashenko.hw7;

public enum Size {
    XXS("Детский размер", 36),
    XS("Взрослый размер", 38),
    S("Взрослый размер", 40),
    M("Взрослый размер", 42),
    L("Взрослый размер", 44);

    private String description;
    private int euroSize;


    Size(String description, int euroSize){
        this.description = description;
        this.euroSize = euroSize;
    }

    public String getDescription(){
        return description;
    }

    public int getEuroSize(){
        return euroSize;
    }
}
