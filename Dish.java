package com.pulkeet.myrestaurant;

public class Dish {
    String name;
    String description;
    int price;

    Dish(String name,String description,int price)
    {
        this.name=name;
        this.description=description;
        this.price=price;
    }

    @Override
    public String toString() {
        return name;
    }
}
