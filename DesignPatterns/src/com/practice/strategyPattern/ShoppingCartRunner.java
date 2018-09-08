package com.practice.strategyPattern;

public class ShoppingCartRunner
{
    public static void main (String[] args)
    {
        ShoppingCart cart = new ShoppingCart(new CreditCardPaymentStrategy("Smital","34535345","345","12/34"));

        Item item1 = new Item("toothpaste",40);
        Item item2 = new Item("brush",10);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.makePayment();

        ShoppingCart cart2 = new ShoppingCart(new MembershipPaymentStrategy("smitalpatel22@gmail.com","password@123"));
        Item item3 = new Item("floor-cleaner",80);
        Item item4 = new Item("scrubber",40);

        cart2.addItem(item3);
        cart2.addItem(item4);

        cart2.makePayment();
    }
}
