package com.example.kieran.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Kieran on 23/07/2017.
 */

public class TestBasket {

    Basket items = new Basket();
    Item socks;

    @Before
    public void setUp() throws Exception {
        items = new Basket();
        socks = new Item();

    }

    @Test
    public void testCreateBasket() throws Exception {
        assertEquals(0, items.itemCount());

    }

    @Test
    public void testAddItemToBasket() throws Exception {
        items.addItem(socks);
        assertEquals(1, items.itemCount());

    }
}
