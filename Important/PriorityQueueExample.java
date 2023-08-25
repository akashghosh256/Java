package Important;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a priority queue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add elements to the priority queue
        priorityQueue.add(30);
        priorityQueue.add(10);
        priorityQueue.add(20);

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
