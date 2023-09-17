package com.tpe.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCarts {

    //
    private List<? super Product<?>>  items;

    public ShoppingCarts(){
        items = new ArrayList<>();
    }

    public void addItem(Product<?> item){
        items.add(item);
    }


    //method return item as a list

    public List<? super Product<?>> getItems(){
        return items;
    }


}
