package com.company;

public class Main {
    public static void main(String[] args) {
        // Initialize fruits inventory
        FruitsInventory fruitsInventory = new FruitsInventory();

        // Initialize prices of fruits added to the inventory
        PriceManager.setupPricesForFruitsAddedToInventory();

        fruitsInventory.printFruitsInInventory();

        // Create and print bill
        Order myOrder = new Order();
        myOrder.printOrderDetails();
        myOrder.printBill();
    }
}