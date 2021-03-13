package com.company;

public class ColorBox extends Box {

    private Color color;

    public ColorBox(int height, int width, int isLong, MaterialBox material) {
        super(height, width, isLong, material);
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }



}
