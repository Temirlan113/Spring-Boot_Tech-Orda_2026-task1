package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter


public class Item {

    private static Long currentId = 0L;
    private Long id;
    private String name;
    private String description;
    private double price;

    public Item() {
        currentId++;
        id = currentId;
    }

    public Item(String name, String description, double price) {
        currentId++;
        this.id = currentId;
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
