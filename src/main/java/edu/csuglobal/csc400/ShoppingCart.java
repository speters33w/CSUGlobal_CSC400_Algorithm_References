package edu.csuglobal.csc400;

import com.pearson.carrano.ArrayBag;


@SuppressWarnings({"rawtypes", "unchecked"})
public class ShoppingCart extends ArrayBag {

    private ShoppingBag[] shoppingBags;
    private int numberOfProducts = 0;  // Number of bags in the shopping cart
    private final int defaultCapacity; // Number of bags the cart can hold

    public ShoppingCart() {
        this.defaultCapacity = 25;
        shoppingBags = new ShoppingBag[defaultCapacity];
    }

    public ShoppingCart(int capacity) {
        super(capacity);
        this.defaultCapacity = capacity;
        shoppingBags = new ShoppingBag[defaultCapacity];
    }

    public boolean add(ShoppingBag newEntry) {
        if (super.add(newEntry)) {
            shoppingBags[numberOfProducts] = newEntry;
            this.numberOfProducts = super.getCurrentSize();
            return true;
        }
        return false;
    }

    @Override
    public ShoppingBag[] toArray() {
        return shoppingBags;
    }

    public void clear() {
        super.clear();
        this.numberOfProducts = 0;
    }

    @Override
    public ShoppingBag remove() {
        ShoppingBag result = (ShoppingBag) super.remove(); // todo check if null
        this.shoppingBags = updateShoppingBags(result);
        this.numberOfProducts = super.getCurrentSize();
        return result;
    }

    public boolean remove(ShoppingBag anEntry) {
        boolean result = super.remove(anEntry);
        if (result) {
            this.shoppingBags = updateShoppingBags(anEntry);
        }
        this.numberOfProducts = super.getCurrentSize();
        return result;
    }

    public boolean isFull(){
        return super.isArrayFull();
    }

    private ShoppingBag[] updateShoppingBags(ShoppingBag anEntry) {
        ShoppingBag[] newShoppingBags = new ShoppingBag[shoppingBags.length];
        int currentIndex = 0;
        for (int index = currentIndex; index < shoppingBags.length; index++) {
            if (shoppingBags[index] != anEntry) {
                newShoppingBags[currentIndex] = shoppingBags[index];
                currentIndex++;
            }
        }
        return newShoppingBags;
    }
}