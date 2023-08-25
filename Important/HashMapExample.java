
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Add key-value pairs to the HashMap
        hashMap.put("apple", 5);
        hashMap.put("banana", 3);
        hashMap.put("orange", 7);

        // Display the HashMap
        System.out.println("HashMap: " + hashMap);

        // Check if the HashMap is empty
        System.out.println("Is HashMap empty? " + hashMap.isEmpty());

        // Get value for a specific key
        String key = "banana";
        if (hashMap.containsKey(key)) {
            int value = hashMap.get(key);
            System.out.println("Value for key '" + key + "': " + value);
        } else {
            System.out.println("Key '" + key + "' not found.");
        }

        // Update value for a specific key
        key = "apple";
        if (hashMap.containsKey(key)) {
            int newValue = 10;
            hashMap.put(key, newValue);
            System.out.println("Updated value for key '" + key + "': " + newValue);
        } else {
            System.out.println("Key '" + key + "' not found.");
        }

        // Remove a key-value pair
        key = "orange";
        hashMap.remove(key);
        System.out.println("HashMap after removing key '" + key + "': " + hashMap);

        // Iterate through the HashMap
        System.out.println("Iterating through the HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Size of the HashMap
        System.out.println("Size of the HashMap: " + hashMap.size());

        // Clear the HashMap
        hashMap.clear();
        System.out.println("HashMap after clearing: " + hashMap);
    }
}
