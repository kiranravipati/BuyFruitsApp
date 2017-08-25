package com.company;

import java.util.HashMap;
import java.util.Map;

public class FruitsInventory {
    static Map<Integer, Fruit> fruitsMap;

    FruitsInventory() {
        fruitsMap = new HashMap<Integer,Fruit>();

        // Creating fruits
        Fruit apple = new Fruit(1,"Apple");
        Fruit banana = new Fruit(2,"Banana");
        Fruit papaya = new Fruit(3,"Papaya");
        Fruit mango = new Fruit(4,"Mango");

        // Adding fruits to map
        fruitsMap.put(apple.getCode(), apple);
        fruitsMap.put(banana.getCode(), banana);
        fruitsMap.put(papaya.getCode(), papaya);
        fruitsMap.put(mango.getCode(), mango);
    }

    // Class method
    public static Fruit getFruitByCode(int code) {
        return fruitsMap.get(code);
    }

    public void printFruitsInInventory() {
        System.out.println("Fruits available:");
        System.out.println("------------------------------------------------------");
        System.out.printf("%5s %10s %16s", "Code" , "Name" , "Price/kg\n" );
        System.out.println("------------------------------------------------------");

        // Traversing fruits map
        for (Map.Entry <Integer, Fruit> entry:fruitsMap.entrySet()){
            int key=entry.getKey();
            Fruit fruit = entry.getValue();
            float  pricePerKg = PriceManager.priceForFruitCode(fruit.getCode());
            System.out.printf("%5d %10s %15.2f", fruit.getCode(), fruit.getName(), pricePerKg);
            System.out.println();
        }
    }
}
