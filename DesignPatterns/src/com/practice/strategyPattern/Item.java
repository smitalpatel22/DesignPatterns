package com.practice.strategyPattern;

public class Item {

    private String upcCode;
    private int price;

    Item(String upc, int cost){
        this.upcCode=upc;
        this.price=cost;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public int getPrice() {
        return price;
    }

}