package com.example.kieran.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Kieran on 26/07/2017.
 */

public class TestCheckout {

    Checkout checkout;
    Basket items;
    Item socks;
    Item book;
    Item umbrella;
    Customer kieran;

    @Before
    public void setUp() throws Exception {
        checkout = new Checkout();
        items = new Basket();
        socks = new Item(2);
        book = new Item(4);
        umbrella = new Item(8);
        kieran = new Customer();

    }

}
