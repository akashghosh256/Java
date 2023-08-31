
import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // Create a HashSet
        Set<String> stringSet = new HashSet<>();

        // Adding elements to the set
        stringSet.add("apple");
        stringSet.add("banana");
        stringSet.add("orange");
        stringSet.add("apple"); // Adding duplicate, it will be ignored

        // Display the set
        System.out.println("Set elements: " + stringSet);

        // Check if an element exists in the set
        System.out.println("Contains 'banana': " + stringSet.contains("banana"));
        System.out.println("Contains 'grape': " + stringSet.contains("grape"));

        // Remove an element from the set
        stringSet.remove("orange");
        System.out.println("After removing 'orange': " + stringSet);

        // Iterate through the set
        System.out.print("Iterating through the set: ");
        for (String element : stringSet) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Size of the set
        System.out.println("Size of the set: " + stringSet.size());

        // Clear the set
        stringSet.clear();
        System.out.println("Set after clearing: " + stringSet);
    }
}
