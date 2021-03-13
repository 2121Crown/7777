package com.company;

public enum  Color {

    RED ("красный"),
    WHITE ("белый");


    private String description;

     Color (String description){
        this.description =  description;

    }

    public String getDescription() {
        return description;
    }



}
