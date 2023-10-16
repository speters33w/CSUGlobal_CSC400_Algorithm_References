```pseudocode
class Item:
    private upc: string
    private productName: string
    private price: BigDecimal
    private description: string
    private quantity: int
    private inStock: boolean
    private imageURL: string

    constructor(upc: string, productName: string, price: BigDecimal, description: string, quantity: int,
                inStock: boolean, imageURL: string):
        this.upc = upc
        this.productName = productName
        this.price = price
        this.description = description
        this.quantity = quantity
        this.inStock = inStock
        this.imageURL = imageURL

    method getUpc() -> string:
        return upc

    method getProductName() -> string:
        return productName

    method getPrice() -> BigDecimal:
        return price

    method getDescription() -> string:
        return description

    method getQuantity() -> int:
        return quantity

    method isInStock() -> boolean:
        return inStock

    method getImageURL() -> string:
        return imageURL

    method setUpc(upc: string):
        this.upc = upc

    method setProductName(productName: string):
        this.productName = productName

    method setDescription(description: string):
        this.description = description

    method setQuantity(quantity: int):
        this.quantity = quantity

    method setInStock(inStock: boolean):
        this.inStock = inStock

    method setImageURL(imageURL: string):
        this.imageURL = imageURL

    method getTotal() -> BigDecimal:
        return price.multiply(new BigDecimal(quantity))

    method equals(item: Item) -> boolean:
        return this.upc.equals(item.getUpc())

    method toString() -> string:
        return String.format("UPC: %s, Product Name: %s, Price: %s%n, " +
                             "Description: %s%n, " +
                             "Quantity: %d, In Stock: %s%n, " +
                             "Image URL: %s",
                             upc, productName, price, description, quantity, inStock, imageURL)
```