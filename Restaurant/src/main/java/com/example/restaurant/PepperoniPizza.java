package com.example.restaurant;

public class PepperoniPizza extends Dish {
    String name;
    double price;

    public PepperoniPizza() {
        this.name = "Peperoni pica";
        this.price = 10.5;
    }

    public Dish prepare() {
        return this;
    }

    public String getName() {
        return name;
    }

}
