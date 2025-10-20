package com.example.restaurant;

public class CabbageSoup extends Dish {
    String name;
    double price;

    public CabbageSoup() {
        this.name = "Kopūstų sriuba";
        this.price = 6.5;
    }

    public Dish prepare() {
        return this;
    }

    public String getName() {
        return name;
    }
}
