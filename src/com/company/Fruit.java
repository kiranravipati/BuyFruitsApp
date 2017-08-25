package com.company;

public class Fruit {
    private int code;
    private String name;

    Fruit(int code, String name) {
        this.code = code;
        this.name = name;
    }

    // accessor methods

    int getCode() {
        return code;
    }

    String getName() {
        return name;
    }

    //overriding the toString() method
    public String toString(){
        return code +" " + name;
    }
}
