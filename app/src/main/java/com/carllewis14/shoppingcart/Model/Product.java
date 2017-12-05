package com.carllewis14.shoppingcart.Model;

/**
 * Produt POJO class
 */

public class Product {

    private long id;
    private String productName;
    private String productDescription;
    private double salePrice;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public Product(){

    }


    public Product(Product product) {

        this.id = product.getId();
        this.productName = product.getProductName();
        this.productDescription = product.getProductDescription();
        this.salePrice = product.getSalePrice();

    }
}
