import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        // Create a deque
        Deque<Integer> deque = new ArrayDeque<>();

        // Add elements to the front and back of the deque
        deque.addFirst(100);
        deque.addFirst(5);
        deque.addLast(600);
        deque.addLast(200);

        // Display the deque
        System.out.println("Deque: " + deque);

        // Check if the deque is empty
        System.out.println("Is deque empty? " + deque.isEmpty());

        // Peek at the front and back elements without removing
        System.out.println("Front element: " + deque.peekFirst());
        System.out.println("Back element: " + deque.peekLast());

        // Remove elements from the front and back of the deque
        System.out.println("Removed from front: " + deque.pollFirst());
        System.out.println("Removed from back: " + deque.pollLast());

        // Display the deque after polling
        System.out.println("Deque after polling: " + deque);

        // Check if the deque is empty again
        System.out.println("Is deque empty? " + deque.isEmpty());
    }
}
