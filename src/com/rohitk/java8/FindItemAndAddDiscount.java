package com.rohitk.java8;

import java.util.Arrays;
import java.util.List;

/**
 * Item class representing name and price.
 */
class Item {

    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return this.getName() + ": " + this.getPrice();
    }
}

/**
 * Class to find items that have price greater than 20
 * add a discount of 10% and then find the total price.
 */
public class FindItemAndAddDiscount {

    private static List<Item> items = Arrays.asList(new Item("Nike", 20.45),
            new Item("Adidas", 31.45), new Item("Reebok", 29.25),
            new Item("Puma", 25.15), new Item("Fila", 15.15));

    private static final double discount = 0.1;
    private static final double priceThreshold = 20;

    public static void main(String[] args) {

        final double total = items.stream()
                .filter(item -> item.getPrice() > priceThreshold)
                .map(item -> item.getPrice() - (item.getPrice() * discount))
                .reduce((first, second) -> (first + second))
                .get();

        System.out.println("Total value : " + total);
    }
}
