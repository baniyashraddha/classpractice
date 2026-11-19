package com.westminster.classpractice.demo.productapi;

public record CreateProductRequest(
        String name,
        int qty,
        boolean inStock,
        double unitPrice

) {
}
