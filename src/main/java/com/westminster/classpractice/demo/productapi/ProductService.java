package com.westminster.classpractice.demo.productapi;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final List<Product> products = new ArrayList<>();
    private long nextId = 1;

    public List<Product> getAllProducts() {
        return products;
    }

    public Optional<Product> getProductById(long id) {
        return products.stream().filter(p -> p.getId() == id).findFirst();
    }

    public List<Product> findByName(String name) {
        return products.stream()
                .filter(p -> p.getName().contains(name)).toList();
    }

    public Product addProduct(Product product) {
        DigitalProduct dp = new DigitalProduct(
                2L,
                "DigitalProduct",
                34.99,
                "http://xsdfa.com/file/3434",
                23.33);


        product.setId(nextId++);
        products.add(product);
        return product;
    }

    public List<Product> addGetInheritedProduct() {
        DigitalProduct dp = new DigitalProduct(
                2L,
                "DigitalProduct",
                34.99,
                "http://xsdfa.com/file/3434",
                23.33);
        PhysicalProduct physicalProduct = new PhysicalProduct(
                2L,
                "DigitalProduct",
                34.99,
                4.08,
                "23x54");
        products.add(dp);
        products.add(physicalProduct);
        return this.products;
    }
    public void deleteProduct(int id) {
        products.removeIf(p -> p.getId() == id);
    }
}