package com.company;

public class Main {
    public static void main(String[] args) {
        // Initialize fruits inventory
        FruitsInventory fruitsInventory = new FruitsInventory();
        fruitsInventory.printFruitsInInventory();

        // Create and print order
        Order myOrder = new Order();
        myOrder.printOrderDetails();
        myOrder.printBill();
    }
}