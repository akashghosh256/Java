package Important;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a stack
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Display the stack
        System.out.println("Stack: " + stack);

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Peek at the top element without removing
        System.out.println("Top element: " + stack.peek());

        // Pop elements from the stack
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        // Display the stack after popping
        System.out.println("Stack after popping: " + stack);

        // Search for an element in the stack
        System.out.println("Search for 10: " + stack.search(10)); // Returns -1 if not found

        // Check if the stack is empty again
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}

