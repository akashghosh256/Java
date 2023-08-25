package Important;

// Synchronization:

// Hashtable: Synchronized (thread-safe).
// HashMap: Not synchronized (not thread-safe by default).
// Performance:

// Hashtable: Might have performance overhead due to synchronization.
// HashMap: Generally better performance in single-threaded scenarios.
// Null Keys and Values:

// Hashtable: Doesn't allow null keys or values.
// HashMap: Allows one null key and multiple null values.
// Legacy:

// Hashtable: Older, considered somewhat legacy.
// HashMap: More modern and preferred in most scenarios.
// Which is Better:
// HashMap: Preferred due to its better performance and flexibility. Use ConcurrentHashMap for 
// thread-safety in multi-threaded scenarios.


import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {
    public static void main(String[] args) {
        // Create a Hashtable
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // Add key-value pairs to the Hashtable
        hashtable.put("apple", 5);
        hashtable.put("banana", 3);
        hashtable.put("orange", 7);

        // Display the Hashtable
        System.out.println("Hashtable: " + hashtable);

        // Check if the Hashtable is empty
        System.out.println("Is Hashtable empty? " + hashtable.isEmpty());

        // Get value for a specific key
        String key = "banana";
        if (hashtable.containsKey(key)) {
            int value = hashtable.get(key);
            System.out.println("Value for key '" + key + "': " + value);
        } else {
            System.out.println("Key '" + key + "' not found.");
        }

        // Update value for a specific key
        key = "apple";
        if (hashtable.containsKey(key)) {
            int newValue = 10;
            hashtable.put(key, newValue);
            System.out.println("Updated value for key '" + key + "': " + newValue);
        } else {
            System.out.println("Key '" + key + "' not found.");
        }

        // Remove a key-value pair
        key = "orange";
        hashtable.remove(key);
        System.out.println("Hashtable after removing key '" + key + "': " + hashtable);

        // Iterate through the Hashtable
        System.out.println("Iterating through the Hashtable:");
        for (Map.Entry<String, Integer> entry : hashtable.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Size of the Hashtable
        System.out.println("Size of the Hashtable: " + hashtable.size());

        // Clear the Hashtable
        hashtable.clear();
        System.out.println("Hashtable after clearing: " + hashtable);
    }
}
