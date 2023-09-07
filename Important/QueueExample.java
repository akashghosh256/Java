// stores data as order of insertion
// and allows fast retrieval of the first element.

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Create a queue
        Queue<Integer> queue = new ArrayDeque<>();

        // Add elements to the queue
        queue.add(30);
        queue.add(10);
        queue.add(200);
        

        // Display the queue
        System.out.println("Queue: " + queue);


        //Queue Size
        System.out.println("Queue size is:"+queue.size());

        // Check if the queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());

        // Peek at the front element without removing
        System.out.println("Front element: " + queue.peek());

        // Remove elements from the queue
        System.out.println("Removed: " + queue.poll()); // Removes and returns the front element
        

        // Remove top element
        queue.poll();

        // Display the queue after polling
        System.out.println("Queue after polling: " + queue);

        // Check if the queue is empty again
        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}

// // Implementing a Queue using an Array--------------------------------------------------------------

// public class QueueUsingArray {
//     private int maxSize;
//     private int front;
//     private int rear;
//     private int[] queueArray;

//     public QueueUsingArray(int size) {
//         maxSize = size;
//         front = 0;
//         rear = -1;
//         queueArray = new int[maxSize];
//     }

//     public boolean isEmpty() {
//         return rear < front;
//     }

//     public boolean isFull() {
//         return rear == maxSize - 1;
//     }

//     public int size() {
//         return rear - front + 1;
//     }

//     public void enqueue(int value) {
//         if (isFull()) {
//             System.out.println("Queue is full. Cannot enqueue " + value);
//             return;
//         }
//         queueArray[++rear] = value;
//     }

//     public int dequeue() {
//         if (isEmpty()) {
//             System.out.println("Queue is empty. Cannot dequeue.");
//             return -1; // You can choose a different value to indicate error.
//         }
//         return queueArray[front++];
//     }

//     public int peek() {
//         if (isEmpty()) {
//             System.out.println("Queue is empty. Nothing to peek.");
//             return -1; // You can choose a different value to indicate error.
//         }
//         return queueArray[front];
//     }

//     public static void main(String[] args) {
//         QueueUsingArray queue = new QueueUsingArray(5);

//         queue.enqueue(10);
//         queue.enqueue(20);
//         queue.enqueue(30);

//         System.out.println("Dequeue: " + queue.dequeue());
//         System.out.println("Peek: " + queue.peek());
//         System.out.println("Size: " + queue.size());
//     }
// }
