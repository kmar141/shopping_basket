package com.example.kieran.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
        kieran = new Customer(true);

    }

    @Test
    public void testBasketPriceTotal() throws Exception {
        items.addItem(socks);
        items.addItem(umbrella);
        assertEquals(10, items.totalPrice(), 0);
    }

    @Test
    public void testOverTwentyDiscount() throws Exception {
        items.addItem(umbrella);
        items.addItem(umbrella);
        items.addItem(umbrella);
        items.addItem(socks);
        items.addItem(book);
        items.totalPrice();
        assertEquals(27, items.totalOverTwenty(), 0);
    }

    @Test
    public void testLoyaltyCardDiscount() throws Exception {
        items.addItem(socks);
        items.totalPrice();
        assertEquals(1.96, items.loyaltyCardDiscount(kieran), 0);


    }


}
