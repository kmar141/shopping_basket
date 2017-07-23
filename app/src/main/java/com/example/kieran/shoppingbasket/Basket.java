package com.example.kieran.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by Kieran on 23/07/2017.
 */

public class Basket {
    public ArrayList<Item> items;

    public Basket() {
        this.items = new ArrayList<Item>();
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public int itemCount(){
        return this.items.size();
    }
}