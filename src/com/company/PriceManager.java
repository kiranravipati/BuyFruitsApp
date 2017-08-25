package com.company;

import java.util.HashMap;
import java.util.Map;

public class PriceManager {
    static Map<Integer, Float> pricesCollection;

    public static void setupPricesForFruitsAddedToInventory() {
        pricesCollection = new HashMap<Integer,Float>();

        // Adding prices of fruits to map
        pricesCollection.put(1, 100.0f);
        pricesCollection.put(2, 30.0f);
        pricesCollection.put(3, 40.0f);
        pricesCollection.put(4, 60.0f);
    }

    public static float priceForFruitCode(int fruitCode) {
        return pricesCollection.get(fruitCode);
    }
}

