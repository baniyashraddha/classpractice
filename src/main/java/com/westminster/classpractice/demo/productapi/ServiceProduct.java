package com.westminster.classpractice.demo.productapi;

public class ServiceProduct extends Product implements Discountable {
    private int durationMinutes;
    private String serviceProvider;
    private boolean isOnline;
    private double discountedPrice;

    public ServiceProduct() {
    }
    public ServiceProduct(
            int id,
            String name,
            int qty,
            boolean inStock,
            double unitPrice,
            double weightKg,
            String dimensions) {

        super(id, name, qty, inStock, unitPrice);
        this.durationMinutes = durationMinutes;
        this.serviceProvider = serviceProvider;
        this.isOnline = isOnline;

    }
    public String getServiceProvider() {
        return this.serviceProvider;
    }

    @Override
    public String getSummary() {
        return "";
    }

    @Override
    public void applyDiscount(double rate) {

    }

    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }
}
