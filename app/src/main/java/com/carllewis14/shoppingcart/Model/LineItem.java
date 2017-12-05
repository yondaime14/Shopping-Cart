package com.carllewis14.shoppingcart.Model;

/**
 * This POJO class extends product to add prices
 */

public class LineItem extends Product {

    private int quantity;


    public LineItem(){

    }

    public LineItem(Product product, int quantity){
        super(product);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSumPrice() {
        return getSalePrice() * quantity;
    }
}
