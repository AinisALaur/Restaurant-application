package com.example.restaurant;

public class Borscht extends Dish {
    String name;
    double price;

    public Borscht() {
        this.name = "Burokėlių sriuba";
        this.price = 8.5;
    }

    public Dish prepare() {
        return this;
    }

    public String getName() {
        return name;
    }
}
