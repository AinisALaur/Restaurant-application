package com.example.restaurant;

public class HawaiiPizza extends Dish {
    String name;
    double price;

    public HawaiiPizza() {
        this.name = "Havajų pica";
        this.price = 8.5;
    }

    public Dish prepare() {
        return this;
    }

    public String getName() {
        return name;
    }
}
