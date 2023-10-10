package edu.csuglobal.csc400;

import java.math.BigDecimal;

public class ShoppingCartItem {
    private String upc;
    private String productName;
    private final BigDecimal price;
    private String description;
    private int quantity; // This is the quantity of items in a package, not the quantity of this item in the cart.
    private boolean inStock;
    private String imageURL;

    public ShoppingCartItem(String upc, String productName, BigDecimal price, String description, int quantity,
                            boolean inStock, String imageURL) {
        this.upc = upc;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
        this.inStock = inStock;
        this.imageURL = imageURL;
    }

    public String getUpc() {
        return upc;
    }

    public String getProductName() {
        return productName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isInStock() {
        return inStock;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public BigDecimal getTotal () {
        return price.multiply(new BigDecimal(quantity));
    }

    public boolean equals(ShoppingCartItem item) {
        return this.upc.equals(item.getUpc());
    }

    public String toString() {
        return String.format("UPC: %s, Product Name: %s, Price: %s%n, " +
                             "Description: %s%n, " +
                             "Quantity: %d, In Stock: %s%n, " +
                             "Image URL: %s",
                upc, productName, price, description, quantity, inStock, imageURL);
    }

}
