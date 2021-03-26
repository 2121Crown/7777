package com.company;


import java.util.Arrays;

public class Warehouse {
    private int capacity;
    Box[] warehouse;

    public Warehouse(int capacity) {
        this.warehouse = new Box[capacity];
        this.capacity = capacity;
    }

    public boolean addBox(Box box) {
        if (capacity > 0) {
            warehouse[capacity - 1] = box;
            capacity--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       for (Box box: warehouse){
           sb.append(box.toString());
           sb.append(",\n" );

       }
       return sb.toString();
    }
}
