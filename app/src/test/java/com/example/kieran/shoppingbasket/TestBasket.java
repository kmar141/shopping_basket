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
    public void testCreateBasket() throws Exception {
        assertEquals(0, items.itemCount());

    }

    @Test
    public void testAddItemToBasket() throws Exception {
        items.addItem(socks);
        assertEquals(1, items.itemCount());

    }

    @Test
    public void testRemoveItemFromBasket() throws Exception {
        items.addItem(socks);
        items.removeItem(socks);
        assertEquals(0, items.itemCount());

    }

    @Test
    public void testAddMultipleItems() throws Exception {
        items.addItem(socks);
        items.addItem(umbrella);
        items.addItem(book);
        assertEquals(3, items.itemCount());

    }

    @Test
    public void testClearEntireBasket() throws Exception {
        items.addItem(socks);
        items.addItem(umbrella);
        items.addItem(book);
        items.clearBasket();
        assertEquals(0, items.itemCount());
    }


}
