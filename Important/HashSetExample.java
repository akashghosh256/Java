import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Add elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");

        // Display the HashSet
        System.out.println("HashSet: " + hashSet);

        // Check if an element exists in the HashSet
        boolean containsBanana = hashSet.contains("Banana");
        System.out.println("Contains Banana: " + containsBanana);

        // Remove an element from the HashSet
        boolean removed = hashSet.remove("Apple");
        System.out.println("Removed Apple: " + removed);

        // Display the updated HashSet
        System.out.println("Updated HashSet: " + hashSet);

        // Get the size of the HashSet
        int size = hashSet.size();
        System.out.println("Size of HashSet: " + size);

        // Clear all elements from the HashSet
        hashSet.clear();
        System.out.println("Cleared HashSet: " + hashSet);
    }
}
