

// In this example, we import the ConcurrentHashMap class and use 
// it to create a concurrent hashmap of strings (keys) and integers 
// (values). We perform similar operations to those in previous examples, including 
// adding key-value pairs, retrieving values based on keys, updating values, removing 
// key-value pairs, iterating through the map, determining the size, and clearing 
// the map.

// Remember that ConcurrentHashMap provides thread-safety for operations, making it suitable 
// for multi-threaded scenarios where multiple threads might access and modify the 
// map concurrently. 

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        // Create a ConcurrentHashMap
        ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();

        // Add key-value pairs to the ConcurrentHashMap
        concurrentHashMap.put("apple", 5);
        concurrentHashMap.put("banana", 3);
        concurrentHashMap.put("orange", 7);

        // Display the ConcurrentHashMap
        System.out.println("ConcurrentHashMap: " + concurrentHashMap);

        // Check if the ConcurrentHashMap is empty
        System.out.println("Is ConcurrentHashMap empty? " + concurrentHashMap.isEmpty());

        // Get value for a specific key
        String key = "banana";
        if (concurrentHashMap.containsKey(key)) {
            int value = concurrentHashMap.get(key);
            System.out.println("Value for key '" + key + "': " + value);
        } else {
            System.out.println("Key '" + key + "' not found.");
        }

        // Update value for a specific key
        key = "apple";
        if (concurrentHashMap.containsKey(key)) {
            int newValue = 10;
            concurrentHashMap.put(key, newValue);
            System.out.println("Updated value for key '" + key + "': " + newValue);
        } else {
            System.out.println("Key '" + key + "' not found.");
        }

        // Remove a key-value pair
        key = "orange";
        concurrentHashMap.remove(key);
        System.out.println("ConcurrentHashMap after removing key '" + key + "': " + concurrentHashMap);

        // Iterate through the ConcurrentHashMap
        System.out.println("Iterating through the ConcurrentHashMap:");
        for (Map.Entry<String, Integer> entry : concurrentHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Size of the ConcurrentHashMap
        System.out.println("Size of the ConcurrentHashMap: " + concurrentHashMap.size());

        // Clear the ConcurrentHashMap
        concurrentHashMap.clear();
        System.out.println("ConcurrentHashMap after clearing: " + concurrentHashMap);
    }
}
