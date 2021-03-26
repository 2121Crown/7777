package com.company;

public class ColorBox extends Box {

    private Color color;

    @Override
    public String toString() {
        return super.toString() + " " + "цвет коробки: " + color + ".";
    }

    public ColorBox(int height, int width, int isLong, MaterialBox material, Color color) {
        super(height, width, isLong, material);
        this.color = color;

    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


}
