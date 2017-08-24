package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Creating map of fruits and order
        Map <Integer, Fruit> fruitsMap = new HashMap <Integer,Fruit>();
        Map <Integer, Integer> orderMap = new HashMap <Integer,Integer>();

        // Creating fruits
        Fruit apple = new Fruit(1,"Apple",100.0f);
        Fruit banana = new Fruit(2,"Banana",30.0f);
        Fruit papaya = new Fruit(3,"Papaya",40.0f);
        Fruit mango = new Fruit(4,"Mango",60.0f);

        // Adding fruits to map
        fruitsMap.put(apple.getCode(), apple);
        fruitsMap.put(banana.getCode(), banana);
        fruitsMap.put(papaya.getCode(), papaya);
        fruitsMap.put(mango.getCode(), mango);

        System.out.println("Fruits available:");
        System.out.println("------------------------------------------------------");
        System.out.printf("%5s %10s %16s", "Code" , "Name" , "Price/kg\n" );
        System.out.println("------------------------------------------------------");

        // Traversing fruits map
        for (Map.Entry <Integer, Fruit> entry:fruitsMap.entrySet()){
            int key=entry.getKey();
            Fruit fruit = entry.getValue();
            System.out.printf("%5d %10s %15.2f", fruit.getCode(), fruit.getName(), fruit.getPricePerKg());
            System.out.println();
        }

        // Creating order
        orderMap.put(apple.getCode(), 2);
        orderMap.put(banana.getCode(), 3);
        orderMap.put(papaya.getCode(), 4);
        orderMap.put(mango.getCode(), 1);

        // Billing details
        System.out.println();
        System.out.println("Order details:");
        System.out.println("------------------------------------------------------");
        System.out.printf("%10s %10s %15s %15s", "Name" , "Quantity" , "Price/kg", "Amount\n" );
        System.out.println("------------------------------------------------------");


        int quantityOrdered, fruitCode;
        Fruit fruit;
        float totalAmount = 0, amount;

        for (Map.Entry <Integer, Integer> entry:orderMap.entrySet()){
            quantityOrdered = entry.getValue();
            fruitCode = entry.getKey();
            fruit = fruitsMap.get(fruitCode);
            amount = fruit.getPricePerKg() * quantityOrdered;
            System.out.printf("%10s %10d %15.2f %15.2f\n", fruit.getName(), quantityOrdered, fruit.getPricePerKg(), amount);

            totalAmount += amount;
        }

        System.out.println("------------------------------------------------------");
        System.out.printf("Total amount payable: %8.2f", totalAmount);
    }
}
