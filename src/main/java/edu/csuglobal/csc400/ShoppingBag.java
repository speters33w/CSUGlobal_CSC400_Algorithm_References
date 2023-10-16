package edu.csuglobal.csc400;

import com.pearson.carrano.BagPackage.BagInterface;

import java.util.ArrayList;
import java.util.Collections;

public class ShoppingBag implements BagInterface<Item> {

    private ArrayList<Item> items = new ArrayList<>();

    public ShoppingBag() {
    }

    public ShoppingBag(ArrayList<Item> items) {
        this.items = items;
    }

    public int getCurrentSize() {
        return items.size();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public boolean add(Item newEntry) {
        items.add(newEntry);
        return true;
    }

    public Item remove(){
        System.out.println("No item selected");
        return null;
    }

    public boolean remove(Item anEntry) {
        if (items.contains(anEntry)) {
            items.remove(anEntry);
            return true;
        }
        return false;
    }

    public void clear() {
        items.clear();
    }

    public int getFrequencyOf(Item anEntry) {
        return Collections.frequency(items, anEntry);
    }

    public boolean contains(Item anEntry) {
        return items.contains(anEntry);
    }

    public Item[] toArray() {
//        return items.toArray(new ShoppingCartItem[items.size()]); // IDE complained about this.
        return items.toArray(new Item[0]);
    }
}
