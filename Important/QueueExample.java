package Important;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a queue
        Queue<String> queue = new ArrayDeque<>();

        // Add elements to the queue
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

        // Display the queue
        System.out.println("Queue: " + queue);

        // Check if the queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());

        // Peek at the front element without removing
        System.out.println("Front element: " + queue.peek());

        // Remove elements from the queue
        System.out.println("Removed: " + queue.poll()); // Removes and returns the front element
        System.out.println("Removed: " + queue.poll());

        // Display the queue after polling
        System.out.println("Queue after polling: " + queue);

        // Check if the queue is empty again
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}
