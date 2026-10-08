package com.westminster.classpractice.demo.productapi;

public class Product {
    private int id;
    private String name;
    private int qty;
    private boolean inStock;
    private double unitPrice;

    public Product(int id, String name, int qty, boolean inStock, double unitPrice) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.inStock = inStock;
        this.unitPrice = unitPrice;
    }

    public int getId() {
        return this.id;
    }

    public int getQty() {
        return this.qty;
    }
}
