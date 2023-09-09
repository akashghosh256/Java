import java.util.*;
//HashMap doesn't guarantee that the elements will be in the correct
// order from left to right.
// To ensure that the elements are ordered correctly, you should use 
// a TreeMap instead of a HashMap. A TreeMap automatically sorts its 
// keys, which in this case represents the horizontal distance from the 
// root. Here's the modified code with the TreeMap:


public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Adding key-value pairs to the TreeMap
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(4, "Four");

        // Iterating over the TreeMap (sorted order)
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Output:
        // Key: 1, Value: One
        // Key: 2, Value: Two
        // Key: 3, Value: Three
        // Key: 4, Value: Four
    }
}


// A `TreeMap` is a class in Java that implements the 
// `NavigableMap` interface, which extends the `SortedMap` interface. It is part of 
// the Java Collections Framework and provides a way to store key-value 
// pairs in a sorted order based on the keys. Here are 
// some key points about `TreeMap`:

// 1. **Sorted Order**: A `TreeMap` automatically maintains 
// its elements in sorted order according to the natural ordering of 
// the keys or a custom comparator that you can specify during 
// its creation. This means that when you iterate over the keys 
// or entries of a `TreeMap`, they are guaranteed to be in 
// ascending order.

// 2. **Key-Value Pairs**: Like a `HashMap`, a `TreeMap` allows you 
// to store key-value pairs. You can associate a value with each 
// key and later retrieve the value using the key.

// 3. **Red-Black Tree**: 
// Internally, a `TreeMap` uses a self-balancing binary search tree called a 
// Red-Black Tree to maintain the sorted order. This data structure ensures 
// that the tree remains balanced, which results in efficient insertion, deletion, 
// and retrieval operations.

// 4. **Duplicates**: By default, `TreeMap` does not allow duplicate 
// keys. If you attempt to insert a key that already exists 
// in the map, the new value will overwrite the old one. 
// If you need to allow duplicate keys, you can use a 
// `Multimap` or create a custom data structure.

// 5. **Performance**: The time complexity 
// for common operations in a `TreeMap` is generally O(log N), where 
// N is the number of elements in the map. This makes 
// `TreeMap` suitable for applications where sorted order or efficient lookup is 
// required.

// 6. **Null Keys**: `TreeMap` does not allow null keys. Attempting to 
// insert a null key will result in a `NullPointerException`.


// In the example 
// above, the `TreeMap` automatically sorts the key-value pairs based on the 
// keys in ascending order. This sorting behavior is useful in various 
// scenarios where you need to maintain a sorted collection of data. 