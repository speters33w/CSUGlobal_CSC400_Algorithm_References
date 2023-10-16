import edu.csuglobal.csc400.Customer;
import edu.csuglobal.csc400.ShoppingBag;
import edu.csuglobal.csc400.Item;

import java.util.Arrays;
import java.util.HashMap;

public class TestShoppingCartBag {
    public static void main(String[] args) {
        HashMap<Customer, ShoppingBag> customerCartMap = new HashMap<>();
        Customer customer1 = new Customer("Customer1234", "John", "Doe",
                "123 Main Street", "Any-town", "NY", "1234567",
                "(555) 555-1212", "jdoe@example.com");
        ShoppingBag bag = new ShoppingBag();
        customerCartMap.put(customer1, bag);
        System.out.printf("Number of items: %d%n", bag.getCurrentSize());
        System.out.printf("Shopping cart is empty? %s%n", bag.isEmpty());
        Item campbellsChunky = ShoppingCartItems.campbellsChunkySoup();
        bag.add(campbellsChunky);
        System.out.printf("Shopping cart is empty? %s%n", bag.isEmpty());
        System.out.printf("Number of items: %d%n", bag.getCurrentSize());
        System.out.printf("Number of soups: %d%n", bag.getFrequencyOf(campbellsChunky));
        bag.add(campbellsChunky);
        System.out.printf("Number of items: %d%n", bag.getCurrentSize());
        System.out.printf("Number of soups: %d%n", bag.getFrequencyOf(campbellsChunky));
        bag.remove(campbellsChunky);
        System.out.printf("Number of items: %d%n", bag.getCurrentSize());
        System.out.printf("Number of soups: %d%n", bag.getFrequencyOf(campbellsChunky));
        System.out.printf("Items in the bag: %s%n", Arrays.toString(bag.toArray()));
    }
}
