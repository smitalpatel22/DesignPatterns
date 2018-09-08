package com.practice.strategyPattern;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart
{
    public List<Item> getItems ()
    {
        return items;
    }

    public void setItems (List<Item> items)
    {
        this.items = items;
    }

    private List<Item> items;
    private PaymentStrategy paymentStrategy;

    ShoppingCart (PaymentStrategy paymentStrategy)
    {
        this.paymentStrategy=paymentStrategy;
        this.items=new ArrayList<>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public void makePayment ()
    {
        int sum = 0;
        for(Item item : items){
            sum += item.getPrice();
        }
        paymentStrategy.pay(sum);
    }
}
