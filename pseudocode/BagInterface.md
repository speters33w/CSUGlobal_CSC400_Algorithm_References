```pseudocode
interface BagInterface<T> {
    function getCurrentSize() : integer
    function isEmpty() : boolean
    function add(newEntry: T) : boolean
    function remove() : T
    function remove(anEntry: T) : boolean
    procedure clear()
    function getFrequencyOf(anEntry: T) : integer
    function contains(anEntry: T) : boolean
    function toArray() : array of T
}
```