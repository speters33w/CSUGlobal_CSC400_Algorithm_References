package edu.csuglobal.csc400;

import com.pearson.carrano.BagInterface;

import java.util.ArrayList;
import java.util.Collections;

/**
 * This class represents a shopping bag of Items with no size restriction.
 */
public class ShoppingBag implements BagInterface<Item> {

    /**
     * An ArrayList of Items in the bag.
     */
    private ArrayList<Item> items = new ArrayList<>();

    /**
     * Default no-args constructor for the ShoppingBag class.
     */
    public ShoppingBag() {
    }

    /**
     * Constructor for the ShoppingBag class that accepts an ArrayList of Items.
     *
     * @param items ArrayList of Items to be added to the bag.
     */
    public ShoppingBag(ArrayList<Item> items) {
        this.items = items;
    }

    /**
     * Returns the number of items in the bag.
     *
     * @return Number of items in the bag.
     */
    public int getCurrentSize() {
        return items.size();
    }

    /**
     * Returns true if the bag is empty.
     *
     * @return True if the bag is empty.
     */
    public boolean isEmpty() {
        return items.isEmpty();
    }

    /**
     * Adds an Item to the bag.
     *
     * @param newEntry Item to be added to the bag.
     * @return True if the item was successfully added to the bag.
     */
    public boolean add(Item newEntry) {
        items.add(newEntry);
        return true;
    }

    /**
     * Removes an Item from the bag.
     *
     * @param anEntry Item to be removed from the bag.
     * @return True if the item was successfully removed from the bag.
     */
    public boolean remove(Item anEntry) {
        if (items.contains(anEntry)) {
            items.remove(anEntry);
            return true;
        }
        return false;
    }

    /**
     * Removes all Items from the bag.
     */
    public void clear() {
        items.clear();
    }

    /**
     * Counts the number of times an Item appears in the bag.
     *
     * @param anEntry Item to be counted.
     * @return The number of times anEntry appears in the bag.
     */
    public int getFrequencyOf(Item anEntry) {
        return Collections.frequency(items, anEntry);
    }

    /**
     * Tests whether an Item is in the bag.
     *
     * @param anEntry Item to locate.
     * @return True if the bag contains anEntry, or false if not.
     */
    public boolean contains(Item anEntry) {
        return items.contains(anEntry);
    }

    /**
     * Retrieves all Items that are in the bag.
     *
     * @return A newly allocated array of all the items in the bag. Note: If the
     *         bag is empty, the returned array is empty.
     */
    public Item[] toArray() {
//        return items.toArray(new ShoppingCartItem[items.size()]); //todo IDE complained about this.
        return items.toArray(new Item[0]);
    }

    //todo equals()
}
