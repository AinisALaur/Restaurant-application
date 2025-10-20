package com.example.restaurant;

public class GreekSalad extends Dish {
    String name;
    double price;

    public GreekSalad() {
        this.name = "Graikiškos salotos";
        this.price = 17.5;
    }

    public Dish prepare() {
        return this;
    }

    public String getName() {
        return name;
    }
}
