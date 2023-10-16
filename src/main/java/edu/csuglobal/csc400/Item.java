package edu.csuglobal.csc400;

import java.math.BigDecimal;

/**
 * This class represents an item that can be put in a shopping bag.
 */
public class Item {
    /**
     * The UPC of the item.
     */
    private String upc;

    /**
     * The product name of the item.
     */
    private String productName;

    /**
     * The price of the item.
     */
    private final BigDecimal price;

    /**
     * The long description of the item.
     */
    private String description;

    /**
     * The quantity of the item.
     * This is the quantity of items in a package, not the quantity of this item in the cart.
     * e.g., 1 case of 12 cans will have a quantity of 12, a single can will have a quantity of 1.
     */
    private int quantity;

    /**
     * True if the item is in stock, false otherwise.
     */
    private boolean inStock;

    /**
     * The full URL of an image of the item.
     */
    private String imageURL;

    /**
     * Constructor for an Item.
     *
     * @param upc The UPC in String form, UPC would require long to save in numeric form.
     * @param productName String representation of the product name.
     * @param price BigDecimal representation of the price of the product.
     * @param description String, long description of the item.
     * @param quantity Integer representation of the quantity of individual items in a set.
     *                 (e.g., 1 case of 12 cans will have a quantity of 12.)
     * @param inStock True if the item is in stock, false otherwise.
     * @param imageURL String representation of a URL of an image of the item.
     */
    public Item(String upc, String productName, BigDecimal price, String description, int quantity,
                boolean inStock, String imageURL) {
        this.upc = upc;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
        this.inStock = inStock;
        this.imageURL = imageURL;
    }

    /**
     * Gets the UPC of the item.
     *
     * @return The UPC of the Item as a String.
     */
    public String getUpc() {
        return upc;
    }

    /**
     * Gets the product name of the item.
     *
     * @return The product name of the Item as a String.
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Gets the price of the item.
     *
     * @return The price of the Item as a BigDecimal.
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * Gets the long description of the item.
     * This may be several lines long without line breaks.
     *
     * @return The long description of the Item as a String.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the quantity of individual units in a set.
     * e.g. 1 case of 12 cans will have a quantity of 12,
     * and a single can can have a quantity of 1.
     *
     * @return The quantity individual units in a set as an integer.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Returns true if the item is in stock, false otherwise.
     *
     * @return True if the item is in stock, false otherwise.
     */
    public boolean isInStock() {
        return inStock;
    }

    /**
     * Returns the URL of an image of the item.
     *
     * @return The URL of an image of the Item as a String.
     */
    public String getImageURL() {
        return imageURL;
    }

    /**
     * Sets the UPC of an item.
     *
     * @param upc The UPC of an Item as a String.
     */
    public void setUpc(String upc) {
        this.upc = upc;
    }

    /**
     * Sets the short product name of an item.
     *
     * @param productName The product name of an Item as a String.
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }


    /**
     * Sets the long description of an item.
     *
     * @param description The long description of an Item as a String.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets the quantity of individual units in a set.
     * e.g. 1 case of 12 cans will have a quantity of 12,
     * and a single can can have a quantity of 1.
     *
     * @param quantity The quantity of individual units in a set as an integer.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Sets whether the item is in stock.
     *
     * @param inStock True if the item is in stock, false otherwise.
     */
    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    /**
     * Sets the URL of an image of an item.
     *
     * @param imageURL The full URL of an image of an Item as a String.
     */
    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }


    public BigDecimal getTotal () {
        return price.multiply(new BigDecimal(quantity));
    }

    /**
     * Returns true if the UPC of the item is the same as the given UPC, false otherwise.
     *
     * @param item The item to compare.
     */
    public boolean equals(Item item) {
        return this.upc.equals(item.getUpc()); //todo This Item.equals() method is too simple a check.
    }

    /**
     * Returns a string representation of the item object.
     *
     * @return String representation of the item object.
     */
    public String toString() {
        return String.format("UPC: %s, Product Name: %s, Price: %s%n, " +
                             "Description: %s%n, " +
                             "Quantity: %d, In Stock: %s%n, " +
                             "Image URL: %s",
                upc, productName, price, description, quantity, inStock, imageURL);
    }

}
