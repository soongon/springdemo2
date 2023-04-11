package kr.re.kitri.springdemo2.model;

import lombok.Data;


public @Data class Product {
    private String productName;
    private int price;
    private boolean isRocket;
    private int quantity;
    private String imageUrl;
    private int point;

    public Product(String productName, int price, boolean isRocket, int quantity, String imageUrl, int point) {
        this.productName = productName;
        this.price = price;
        this.isRocket = isRocket;
        this.quantity = quantity;
        this.imageUrl = imageUrl;
        this.point = point;
    }
}
