
import java.util.PriorityQueue;


// In this example, we use the PriorityQueue class to create 
// a Min Heap. By default, the PriorityQueue follows the natural ordering 
// of elements, which makes it behave like a Min Heap where 
// the minimum element is at the root.

// Keep in mind that the 
// PriorityQueue class provides basic heap functionality. If you need more advanced 
// heap operations or want to build a heap from an existing 
// array, you might want to explore third-party libraries or implement your 
// own heap class. 


public class MinHeapExample {
    public static void main(String[] args) {
        // Create a Min Heap using PriorityQueue
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Insert elements into the Min Heap
        minHeap.add(20);
        minHeap.add(10);
        minHeap.add(30);
        minHeap.add(5);


        int k =3;
        int nums[] = {4,5,6,7,1,3,4};
         PriorityQueue<Integer> minh = new PriorityQueue<>(k);
        for (int a :nums) {
            minh.offer(a);
        }
          System.out.println("Minimum element: " + minh.peek());

        // Display the Min Heap
        System.out.println("Min Heap (PriorityQueue): " + minHeap);

        // Check if the Min Heap is empty
        System.out.println("Is Min Heap empty? " + minHeap.isEmpty());

        // Peek at the minimum element without removing
        System.out.println("Minimum element: " + minHeap.peek());

        // Remove elements from the Min Heap
        System.out.println("Removed: " + minHeap.poll()); // Removes and returns the minimum element
        System.out.println("Removed: " + minHeap.poll());

        // Display the Min Heap after polling
        System.out.println("Min Heap after polling: " + minHeap);

        // Check if the Min Heap is empty again
        System.out.println("Is Min Heap empty? " + minHeap.isEmpty());
    }
}
