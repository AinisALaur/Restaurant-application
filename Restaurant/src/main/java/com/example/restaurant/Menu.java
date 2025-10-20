package com.example.restaurant;

public class Menu {
    private static Menu single_instance = null;
    private Menu() { }

    public static Menu getInstance() {
        if (single_instance == null) {
            single_instance = new Menu();
        }
        return single_instance;
    }

    public Dish createDish(String dish){
        return switch(dish){
            case "HawaiiPizza" -> new HawaiiPizza();
            case "PepperoniPizza" -> new PepperoniPizza();
            case "GreekSalad" -> new GreekSalad();
            case "CesarSalad" -> new CesarSalad();
            case "CabbageSoup" -> new CabbageSoup();
            case "Borscht" -> new Borscht();
            default -> null;
        };
    }
}
