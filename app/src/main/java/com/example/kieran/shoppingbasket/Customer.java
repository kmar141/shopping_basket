package com.example.kieran.shoppingbasket;

/**
 * Created by Kieran on 26/07/2017.
 */

public class Customer {

    boolean loyaltyCard;

    public Customer(boolean loyaltyCard){
        this.loyaltyCard = loyaltyCard;
    }

    public boolean hasLoyaltyCard() {
        return loyaltyCard;
    }

    public void setLoyaltyCard(boolean loyaltyCard) {
        this.loyaltyCard = loyaltyCard;
    }
}
