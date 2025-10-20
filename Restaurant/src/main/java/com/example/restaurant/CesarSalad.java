package com.example.restaurant;

public class CesarSalad extends Dish {
    String name;
    double price;

    public CesarSalad() {
        this.name = "Cezario salotos";
        this.price = 14;
    }

    public Dish prepare() {
        return this;
    }

    public String getName() {
        return name;
    }
}
