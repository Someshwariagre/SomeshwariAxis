package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class MapAndSetExample {
    private Map<String, Double> itemPrices;
    private Set<String> availableItems;
    private Set<String> soldItems;

    public MapAndSetExample() {
        itemPrices = new HashMap<>();
        availableItems = new HashSet<>();
        soldItems = new HashSet<>();
    }

    public void addItem(String itemName, double price) {
        itemPrices.put(itemName, price);
        availableItems.add(itemName);
    }

    public void sellItem(String itemName) {
        if (!availableItems.contains(itemName)) {
            System.out.println("Item " + itemName + " is not available for sale.");
            return;
        }

        soldItems.add(itemName);
        availableItems.remove(itemName);
    }

    public void printAvailableItems() {
        System.out.println("Available items:-");
        for (String itemName : availableItems) {
            System.out.println(itemName + ": rs." + itemPrices.get(itemName));
        }
    }

    public void printSoldItems() {
        System.out.println("Sold items:-");
        for (String itemName : soldItems) {
            System.out.println(itemName + ": rs." + itemPrices.get(itemName));
        }
    }

    public static void main(String[] args) {
        MapAndSetExample mall = new MapAndSetExample();

        mall.addItem("Shirt", 25.99);
        mall.addItem("Pants", 35.99);
        mall.addItem("Hat", 15.99);

        mall.printAvailableItems();
        mall.sellItem("Shirt");
        mall.printAvailableItems();
        mall.printSoldItems();
    }
}
