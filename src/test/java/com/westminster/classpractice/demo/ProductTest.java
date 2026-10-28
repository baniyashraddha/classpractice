package com.westminster.classpractice.demo;

import com.westminster.classpractice.demo.productapi.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
    @Test
    public void testProduct() {
        Product product = new Product(11, "Laptop", 20, true, 12.33);
        assertEquals(11, product.getId());
        assertEquals("Laptop", product.getName());
    }
}