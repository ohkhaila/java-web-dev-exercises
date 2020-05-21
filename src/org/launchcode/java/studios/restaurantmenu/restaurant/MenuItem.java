package org.launchcode.java.studios.restaurantmenu.restaurant;

import java.util.ArrayList;

public class MenuItem {
    private double price;
    private String description;
    ArrayList<Category> category;

    public MenuItem(double price, String description, ArrayList<Category> category){
        this.price = price;
        this.description = description;
        this.category = category;
    }

}

