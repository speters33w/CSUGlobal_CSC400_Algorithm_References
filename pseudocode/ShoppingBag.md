```pseudocode
class ShoppingBag implements BagInterface {
    items: ArrayList of Item

    constructor ShoppingBag()
        items = new ArrayList()

    constructor ShoppingBag(items: ArrayList of Item)
        this.items = items

    method getCurrentSize() returns integer
        return items.size()

    method isEmpty() returns boolean
        return items.isEmpty()

    method add(newEntry: Item) returns boolean
        items.add(newEntry)
        return true

    method remove() returns Item
        print "No item selected"
        return null

    method remove(anEntry: Item) returns boolean
        if items contains anEntry
            items.remove(anEntry)
            return true
        return false

    method clear()
        items.clear()

    method getFrequencyOf(anEntry: Item) returns integer
        return frequency of anEntry in items

    method contains(anEntry: Item) returns boolean
        return items contains anEntry

    method toArray() returns array of Item
        return items.toArray(new Item[0])
}
```