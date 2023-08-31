

// In this example, we create a Max Heap using the 
// PriorityQueue class with a custom comparator (Comparator.reverseOrder()) to reverse the natural 
// ordering of elements. This effectively makes the PriorityQueue behave as a 
// Max Heap, where the maximum element is at the root. 

import java.util.Comparator;
import java.util.PriorityQueue;

public class MaxHeapExample {
    public static void main(String[] args) {
        // Create a max-heap (PriorityQueue with custom comparator)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        //PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)-> b - a);  // same can be done without using co 


        // Add elements to the heap
        maxHeap.add(10);
        maxHeap.add(30);
        maxHeap.add(20);
        maxHeap.add(5);
        maxHeap.add(500);
        maxHeap.offer(245);  // offer() is the same as add()



        // Display the heap
        System.out.println("Max-Heap (PriorityQueue): " + maxHeap);

        // Check if the heap is empty
        System.out.println("Is heap empty? " + maxHeap.isEmpty());

        // Peek at the maximum element without removing
        System.out.println("Maximum element: " + maxHeap.peek());

        // Remove elements from the heap
        System.out.println("Removed: " + maxHeap.poll()); // Removes and returns the maximum element
        System.out.println("Removed: " + maxHeap.poll());

        // Display the heap after polling
        System.out.println("Max-Heap after polling: " + maxHeap);

        // Check if the heap is empty again
        System.out.println("Is heap empty? " + maxHeap.isEmpty());
    }
}

