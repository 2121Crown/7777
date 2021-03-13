package com.company;




public class Main {
    public static void main(String[] args) {

        ColorBox ColorBox = new ColorBox(Color.RED);

        Box Box  = new Box ( -2, 5, 2);
        Box Box1 = new Box ( -2, 5, 2);
        Box Box2 = new Box ( 3, 5, 2);
        Box Box3 = new Box ( 5, 5, 2);
        Box Box4 = new Box ( 5, 5, 2);
        Box Box5 = new Box ( 6, 5, 2);


        Box1.setHeight(-5);
        Box1.setIsLong(1);
        Box1.setWidth(1);

        System.out.println(ColorBox);


        Box.getWidth();
        Box.getIsLong();
        Box.getHeight();

        System.out.println(Box.getValue());
        System.out.println(Box3.getValue());
        System.out.println(Box4.getValue());
        System.out.println(Box5.getValue());

        System.out.println("Объём " + Box1.getValue() + " л");
        System.out.println("Цвет и материал коробки: " + ColorBox +" , " + Box1.getMaterial());

        System.out.println("Объём " + Box3.getValue() + " л");
        System.out.println("Цвет и материал коробки: " + ColorBox +" , " + Box3.getMaterial());

        System.out.println("Объём " + Box.getValue() + " л");
        System.out.println("Цвет и материал коробки: " + ColorBox +" , " + Box.getMaterial());

    }
}