package com.westminster.classpractice.demo.productapi;

public class Person {
    private int id;
    private String name;
    private String birthdate;

    public Person(int id, String name, String birthdate) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
    }
    public String getAge() {
        return birthdate;
    }

}
