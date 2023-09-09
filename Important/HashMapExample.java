

import java.util.HashMap;
import java.util.Map;

// To ensure that the elements are ordered correctly, you should use 
// a TreeMap instead of a HashMap. A TreeMap automatically sorts its 
// keys, which in this case represents the horizontal distance from the 
// root. HashMap doesn't guarantee that the elements will be in the correct
// order from left to right.


public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Create a frequency map to store the count of each number
        int nums[] = {1,1,1,2,2,3};
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

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


        // way to print map
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


// In Java, a HashMap is a data structure that doesn't 
// maintain the order of its entries based on their keys or 
// values. However, if you want to sort the entries of a 
// HashMap based on their values, you can follow these steps:

// Create a 
// list of map entries.
// Sort the list of entries based on their 
// values.
// Create a new LinkedHashMap to maintain the sorted order of entries.
// Iterate 
// through the sorted entry list and put the entries into the 
// new LinkedHashMap.
// Here's some sample code to demonstrate this process:

// import java.util.*;

// public 
// class SortHashMapByValue {
//     public static void main(String[] args) 
// {
//         HashMap<String, Integer> hashMap = new HashMap<>();
        
// hashMap.put("Apple", 5);
//         hashMap.put("Banana", 3);
        
// hashMap.put("Cherry", 8);
//         hashMap.put("Grapes", 2);
        
        
// List<Map.Entry<String, Integer>> entryList = new ArrayList<>(hashMap.entrySet());
        
        
// // Sort the entry list based on values using a custom 
// comparator
//         entryList.sort((entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue()));
        
        
// // Create a new LinkedHashMap to maintain the sorted order
        
// LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        
// for (Map.Entry<String, Integer> entry : entryList) {
            
// sortedMap.put(entry.getKey(), entry.getValue());
//         }
        
        
// // Print the sorted map
        
// for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            
// System.out.println(entry.getKey() + ": " + entry.getValue());
        
// }
//     }
// }
// Keep in mind that this example sorts the HashMap by 
// its values in ascending order. If you want to sort in 
// descending order, you can modify the comparator accordingly:

// java
// Copy code
// entryList.sort((entry1, entry2) -> 
// entry2.getValue().compareTo(entry1.getValue()));
// Remember that if you frequently need to maintain a sorted order 
// based on values, you might consider using a data structure designed 
// for this purpose, such as a TreeMap with a custom comparator. 