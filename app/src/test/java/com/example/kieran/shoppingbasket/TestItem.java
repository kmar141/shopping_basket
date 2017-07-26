package com.example.kieran.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Kieran on 26/07/2017.
 */

public class TestItem {

    Basket items;
    Item socks;
    Item book;
    Item umbrella;

    @Before
    public void setUp() throws Exception {
        items = new Basket();
        socks = new Item(2);
        book = new Item(4);
        umbrella = new Item(8);

    }


    @Test
    public void testItemHasPrice() throws Exception {
        assertEquals(2, socks.getPrice());
    }
}
