package com.example.restaurant;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    Menu menu = Menu.getInstance();

    @FXML
    ChoiceBox<String> productType;
    @FXML
    ChoiceBox<String> productId;

    public void initialize(){
        String[] choices = {"Salotos", "Picos", "Sriubos"};
        for(String choice : choices){
            productType.getItems().add(choice);
        }
    }

    public void productTypeHandler(ActionEvent e){
        productId.getItems().clear();
        String dishType =  productType.getValue();
        Dish []dishes = null;
        if(dishType.equals("Salotos")) {
            dishes = new Dish[]{menu.createDish("CesarSalad"), menu.createDish("GreekSalad")};
        }else if(dishType.equals("Picos")) {
            dishes = new Dish[]{menu.createDish("HawaiiPizza"), menu.createDish("PepperoniPizza")};
        }else{
            dishes = new Dish[]{menu.createDish("CabbageSoup"), menu.createDish("Borscht")};
        }

        for(Dish dish : dishes){
            productId.getItems().add(dish.getName());
        }
    }





}
