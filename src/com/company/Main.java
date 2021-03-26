package com.company;


import java.sql.SQLOutput;
import java.util.WeakHashMap;

public class Main {
    public static void main(String[] args) {

        ColorBox colorBox = new ColorBox(1,2,3, MaterialBox.PAPER,Color.RED);
        Box colorBox1 = new ColorBox(1,2,3, MaterialBox.PAPER,Color.RED);



        Box box  = new Box ( 1, 5, 2);
        Box box1 = new Box ( -2, 5, 2);
        Box box2 = new Box ( 3, 5, 2);
        Box box3 = new Box ( 5, 5, 2);
        Box box4 = new Box ( 5, 5, 2);
        Box box5 = new Box ( 6, 5, 2);
//
//        box1.setHeight(1);
//        box1.setIsLong(1);
//        box1.setWidth(1);
//
//
//        box.getWidth();
//        box.getIsLong();
//        box.getHeight();
//
//        box.setMaterial(MaterialBox.METALL);
//
//        colorBox.setColor(Color.WHITE);
//
//        colorBox.setMaterial(MaterialBox.METALL);
//
//
//
//
//        System.out.println(box.getValue());
//        System.out.println(box3.getValue());
//        System.out.println(box4.getValue());
//        System.out.println(box5.getValue());
//
//        System.out.println("Объём " + box1.getValue() + " л");
//
//        System.out.println("Цвет и материал коробки: " + colorBox.getColor() +" , " + colorBox.getMaterial());
//
//
//        System.out.println(colorBox.toString());

        Box boxC = new ColorBox(1,1,1,MaterialBox.METALL,Color.RED);
//
//        System.out.println(boxC.toString());

        Warehouse warehouse = new Warehouse(3);
        warehouse.addBox(box1);
        warehouse.addBox(colorBox1);
        warehouse.addBox(box);
        System.out.println(warehouse.toString());
    }
}

