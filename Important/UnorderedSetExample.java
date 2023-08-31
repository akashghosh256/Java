

// Keep in mind that the HashSet class is unordered, meaning it 
//doesn't maintain any specific order of elements. 
//If you need to maintain insertion order or provide a custom ordering,
//you might consider using LinkedHashSet or
//other set implementations provided by the Java standard library.

import java.util.HashSet;
import java.util.Set;

public class UnorderedSetExample {
    public static void main(String[] args) {
        // Create an unordered set (HashSet)
        Set<Integer> unorderedSet = new HashSet<>();

        // Add elements to the set
        unorderedSet.add(5);
        unorderedSet.add(10);
        unorderedSet.add(3);
        unorderedSet.add(5); // Adding duplicate, it will be ignored

        // Display the set
        System.out.println("Unordered Set (HashSet): " + unorderedSet);

        // Check if an element exists in the set
        System.out.println("Contains 10: " + unorderedSet.contains(10));
        System.out.println("Contains 7: " + unorderedSet.contains(7));

        // Remove an element from the set
        unorderedSet.remove(3);
        System.out.println("Set after removing 3: " + unorderedSet);

        // Iterate through the set
        System.out.print("Iterating through the set: ");
        for (Integer element : unorderedSet) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Size of the set
        System.out.println("Size of the set: " + unorderedSet.size());

        // Clear the set
        unorderedSet.clear();
        System.out.println("Set after clearing: " + unorderedSet);
    }
}
