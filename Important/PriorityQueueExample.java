//priority queue stores data in sorted order (ascending order by default) 
//and allows fast retrieval of the smallest element.


import java.util.*;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a priority queue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add elements to the priority queue
        priorityQueue.add(30);
        priorityQueue.add(10);
        priorityQueue.add(200);

        // Display the priority queue
        System.out.println("PriorityQueue: " + priorityQueue);

        // Check if the priority queue is empty
        System.out.println("Is priority queue empty? " + priorityQueue.isEmpty());

        // Peek at the front element without removing
        System.out.println("Front element: " + priorityQueue.peek());

        // Remove elements from the priority queue
        System.out.println("Removed: " + priorityQueue.poll());
        System.out.println("Removed: " + priorityQueue.poll());

        // Display the priority queue after polling
        System.out.println("PriorityQueue after polling: " + priorityQueue);

        // Check if the priority queue is empty again
        System.out.println("Is priority queue empty? " + priorityQueue.isEmpty());
        
    }
}



// In Java, a PriorityQueue gives priority to elements based on 
// their natural order (ascending order) or the order defined by a 
// specified Comparator.

// Here's how it works:

// Natural Ordering: If you create a PriorityQueue 
// without specifying a Comparator, it will use the natural ordering of 
// elements. For example, if you have a PriorityQueue of integers, it 
// will prioritize smaller integers over larger ones. Similarly, if you have 
// a PriorityQueue of strings, it will prioritize strings in lexicographical (alphabetical) 
// order.
// Example of using natural ordering with integers: 

// PriorityQueue<Integer> pq = new PriorityQueue<>();
// pq.add(3);
// pq.add(1);
// pq.add(2);
// System.out.println(pq.poll()); // Output: 1

// Custom Comparator: You can also provide a custom Comparator when 
// creating a PriorityQueue to specify the order based on your requirements. 
// For example, you can create a PriorityQueue that prioritizes elements in 
// descending order.
// Example of using a custom comparator with integers: 

// PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
// pq.add(3);
// pq.add(1);
// pq.add(2);
// System.out.println(pq.poll()); // Output: 3
// So, depending on whether you use natural ordering or a custom Comparator, a PriorityQueue 
// will give priority to elements accordingly.


















