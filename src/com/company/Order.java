package com.company;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List <OrderItem> orderItems;

    Order() {
        orderItems = new ArrayList<OrderItem>();
        orderItems.add(new OrderItem(1,2));
        orderItems.add(new OrderItem(2,3));
        orderItems.add(new OrderItem(3,4));
    }

    public void printOrderDetails(){
        System.out.println();
        System.out.println("Order details:");
        System.out.println("------------------------------------------------------");
        System.out.printf("%5s %10s %15s \n", "Code" , "Name", "Quantity");
        System.out.println("------------------------------------------------------");

        //Traversing list
        for (OrderItem orderItem : orderItems) {
            int fruitCode = orderItem.fruitCode;
            Fruit fruit = FruitsInventory.getFruitByCode(fruitCode);
            System.out.printf("%5d %10s %10d \n", fruitCode, fruit.getName(), orderItem.quantity);
        }
    }

    public void printBill() {
        System.out.println();
        System.out.println("Bill:");
        System.out.println("------------------------------------------------------");
        System.out.printf("%10s %10s %15s %15s\n", "Name" , "Quantity" , "Price/kg", "Amount" );
        System.out.println("------------------------------------------------------");

        int quantityOrdered, fruitCode;
        Fruit fruit;
        float totalAmount = 0, amount;

        for (OrderItem orderItem : orderItems) {
            fruitCode = orderItem.fruitCode;
            quantityOrdered = orderItem.quantity;
            fruit = FruitsInventory.getFruitByCode(fruitCode);
            amount = fruit.getPricePerKg() * quantityOrdered;
            totalAmount += amount;
            System.out.printf("%10s %10s %15.2f %15.2f \n", fruit.getName(), quantityOrdered, fruit.getPricePerKg(), amount);
        }

        System.out.println("------------------------------------------------------");
        System.out.printf("Total amount payable: %.2f", totalAmount);
    }
}