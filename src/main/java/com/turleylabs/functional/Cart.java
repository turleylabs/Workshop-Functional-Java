package com.turleylabs.functional;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    ArrayList<Item> items = new ArrayList<>();
    ArrayList<Item> unavailableItems = new ArrayList<>();

    public static Cart createCart() {
        Cart cart = new Cart();
        cart.addItem(new Item("TV", "ELECTRONICS"));
        cart.addItem(new Item("iPhone", "ELECTRONICS"));
        cart.addItem(new Item("iPad", "ELECTRONICS"));
        cart.addItem(new Item("Hamilton Tickets", "EVENT"));
        cart.addItem(new Item("Coffee maker", "Kitchen"));
        cart.addItem(new Item("Knife block", "Kitchen"));
        cart.addItem(new Item("Couch", "Furniture"));
        return cart;
    }

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void markAsUnavailable(Item item) {
        unavailableItems.add(item);
    }

    public List<Item> getUnavailableItems() {
        return unavailableItems;
    }
}
