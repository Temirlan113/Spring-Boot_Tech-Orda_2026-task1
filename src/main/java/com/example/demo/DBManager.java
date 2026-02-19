package com.example.demo;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Item> items = new ArrayList<>();

    static {
        items.add(new Item("Mac Book Pro", "8 GB RAM 256 GB SSD Intel Core i7", 1199.99));
        items.add(new Item("Mac Book Pro", "16 GB RAM 500 GB SSD Apple M1", 1499.99));
        items.add(new Item("Mac Book Pro", "16 GB RAM 1 TB SSD Apple M1", 1799.99));
        items.add(new Item("ASUS Tuf Gaming", "16 GB RAM 500 GB SSD Intel Core i7", 1299.99));
        items.add(new Item("HP ProBook", "8 GB RAM 500 GB SSD Intel Core i5", 999.99));
        items.add(new Item("Lenovo Legion", "32 GB RAM 512 GB SSD Intel Core i7", 1399.99));

    }
//    public static void addItem(Item item){
//        items.add(item);
//    }

    public static ArrayList<Item> getAllItems(){
        return items;
    }
}
