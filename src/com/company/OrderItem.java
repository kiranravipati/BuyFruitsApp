package com.company;

public class OrderItem {
    int fruitCode;
    int quantity;

    OrderItem(int fruitCode, int quantity) {
        this.fruitCode = fruitCode;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        Fruit fruit = FruitsInventory.getFruitByCode(fruitCode);
        String s = String.format("%5d %10s %10d\n", fruitCode, fruit.getName(), quantity);
        return s;
    }
}
