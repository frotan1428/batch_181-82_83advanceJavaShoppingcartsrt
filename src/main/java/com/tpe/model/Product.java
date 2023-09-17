package com.tpe.model;

public class Product<T> {
    private String name;

    private T price;

    private ItemType itemType;

    public Product(String name, T price, ItemType itemType) {
        this.name = name;
        this.price = price;
        this.itemType = itemType;
    }

    // method for return the name
    public String getName(){
        return name;
    }

    //price
    public T getPrice(){
        return price;
    }

    //method for select the category

    public ItemType getItemType(){
        return itemType;
    }

}
