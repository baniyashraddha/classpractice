package com.westminster.classpractice.demo;

import com.westminster.classpractice.demo.productapi.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
    @Test
    public void testProduct() {
        Product product = new Product(1L, "Laptop", 999.99);
        assertEquals(11, product.getId());
        assertEquals("Laptop", product.getName());
    }
}