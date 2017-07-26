package com.example.kieran.shoppingbasket;

import static android.R.attr.name;

/**
 * Created by Kieran on 23/07/2017.
 */

public class Item {

    public Item(int price) {
        this.price = price;

    }

    private int price;

    public int getPrice() {
        return price;
    }
}
