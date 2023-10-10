package edu.csuglobal.csc400;

import com.pearson.carrano.BagInterface;

import java.util.ArrayList;
import java.util.Collections;

public class ShoppingCartBag implements BagInterface<ShoppingCartItem> {

    private ArrayList<ShoppingCartItem> items = new ArrayList<ShoppingCartItem>();

    public ShoppingCartBag() {
    }

    public ShoppingCartBag(ArrayList<ShoppingCartItem> items) {
        this.items = items;
    }

    public int getCurrentSize() {
        return items.size();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public boolean add(ShoppingCartItem newEntry) {
        items.add(newEntry);
        return true;
    }

    public ShoppingCartItem remove(){
        System.out.println("No item selected");
        return null;
    }

    public boolean remove(ShoppingCartItem anEntry) {
        if (items.contains(anEntry)) {
            items.remove(anEntry);
            return true;
        }
        return false;
    }

    public void clear() {
        items.clear();
    }

    public int getFrequencyOf(ShoppingCartItem anEntry) {
        return Collections.frequency(items, anEntry);
    }

    public boolean contains(ShoppingCartItem anEntry) {
        return items.contains(anEntry);
    }

    public ShoppingCartItem[] toArray() {
//        return items.toArray(new ShoppingCartItem[items.size()]); // IDE complained about this.
        return items.toArray(new ShoppingCartItem[0]);
    }
}
