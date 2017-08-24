package com.company;

public class Fruit {
    private int code;
    private String name;
    private float pricePerKg;

    Fruit(int code, String name, float pricePerKg) {
        this.code = code;
        this.name = name;
        this.pricePerKg = pricePerKg;
    }

    // accessor methods

    int getCode() {
        return code;
    }

    String getName() {
        return name;
    }

    float getPricePerKg() {
        return pricePerKg;
    }
}
