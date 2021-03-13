package com.company;

public enum MaterialBox {

    METALL("Металл"),
    PAPER("Бумага");


    private String description;

    MaterialBox(String description){
        this.description =  description;

    }

    public String getDescription() {
        return description;
    }

}
