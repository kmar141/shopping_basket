package com.example.kieran.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by Kieran on 23/07/2017.
 */

public class Basket {
    public ArrayList<Item> items;
    double total = 0;
    double discount = 0;

    public Basket() {
        this.items = new ArrayList<Item>();
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public int itemCount(){
        return this.items.size();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void clearBasket() {
        items.clear();
    }


    public double totalPrice() {
        for (Item item : items){
            total = total + item.getPrice();
        }
        return total;
    }

    public double totalOverTwenty() {
        if (total > 20) {
            discount = (total * 0.9);
        }
        return discount;
    }
}