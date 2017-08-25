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
            Fruit fruit = FruitsInventory.getFruitByCode(orderItem.fruitCode);
            System.out.print(orderItem);
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
        float totalAmount = 0, amount, pricePerKg;

        for (OrderItem orderItem : orderItems) {
            fruitCode = orderItem.fruitCode;
            quantityOrdered = orderItem.quantity;
            fruit = FruitsInventory.getFruitByCode(fruitCode);
            pricePerKg = PriceManager.priceForFruitCode(fruitCode);
            amount = pricePerKg * quantityOrdered;
            totalAmount += amount;
            System.out.printf("%10s %10s %15.2f %15.2f \n", fruit.getName(), quantityOrdered, pricePerKg, amount);
        }

        System.out.println("------------------------------------------------------");
        System.out.printf("Total amount payable: %.2f", totalAmount);
    }
}