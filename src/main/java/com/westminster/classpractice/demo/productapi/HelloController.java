package com.westminster.classpractice.demo.productapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/api/product")
    public String hello() {
        return "Hello from java.";
    }
}


