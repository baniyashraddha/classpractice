package com.westminster.classpractice.demo.productapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/api/product")
    public String product() {
        Product product = new Product(1011, "Laptop", 999.99);
        return product.getPrice();
    }
    @GetMapping("/api/address/{city}")
    public String getFullAddress(@PathVariable String city) {
        Address address = new Address(109, "Home", "Bagmati", "Kathmandu", "Nepal");
        return address.getFullAddress();
    }
    @GetMapping("/api/person")
    public String person() {
        Person person = new Person(23, "shraddha", "88");
        return person.getAge();
    }

}


