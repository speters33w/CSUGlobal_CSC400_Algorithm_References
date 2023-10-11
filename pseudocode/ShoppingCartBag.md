```
class ShoppingCartBag implements BagInterface {
    items: ArrayList of ShoppingCartItem

    constructor ShoppingCartBag()
        items = new ArrayList()

    constructor ShoppingCartBag(items: ArrayList of ShoppingCartItem)
        this.items = items

    method getCurrentSize() returns integer
        return items.size()

    method isEmpty() returns boolean
        return items.isEmpty()

    method add(newEntry: ShoppingCartItem) returns boolean
        items.add(newEntry)
        return true

    method remove() returns ShoppingCartItem
        print "No item selected"
        return null

    method remove(anEntry: ShoppingCartItem) returns boolean
        if items contains anEntry
            items.remove(anEntry)
            return true
        return false

    method clear()
        items.clear()

    method getFrequencyOf(anEntry: ShoppingCartItem) returns integer
        return frequency of anEntry in items

    method contains(anEntry: ShoppingCartItem) returns boolean
        return items contains anEntry

    method toArray() returns array of ShoppingCartItem
        return items.toArray(new ShoppingCartItem[0])
}
```