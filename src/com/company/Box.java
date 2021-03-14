package com.company;


public class Box {

    private int height;
    private int width;
    private int isLong;
    private MaterialBox material;


    public Box(int height, int width, int isLong) {

        if (isLong <= 0 || height <= 0 || width <= 0) {
            System.out.println("Неверно задано значение");
        } else {
            this.height = height;
            this.width = width;
            this.isLong = isLong;}
    }
    public Box (int height, int width, int isLong, MaterialBox  material) {

        this(height,width,isLong);
        this.material  = material;

        if (isLong <= 0 || height <= 0 || width <= 0) {
            System.out.println("Неверно задано значение");
        }
    }
        public void  setMaterial(MaterialBox  material) {
            this.material = material;

    }
        public MaterialBox getMaterial() {
                return material;
    }


        public int getHeight() {
        return height;
    }


    public void setHeight(int height) {
        if (height <= 0) {
            System.out.println("Неверно задано значение");
            return;
        }
        this.height = height;

    }    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width <= 0) {
            System.out.println("Неверно задано значение");
            return;
        }
        this.width = width;
    }
    public int getIsLong() {
        return isLong;
    }

    public void setIsLong(int isLong) {
        if (isLong <= 0){
            System.out.println("Неверно задано значение");
            return;
        }
        this.isLong = isLong;

    }

    public int getValue () {

        return height * width * isLong;

    }
}