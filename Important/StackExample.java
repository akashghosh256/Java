

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a stack
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Stack Size
        System.out.println("Stack Size:"+stack.size());

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

// Implementing a Stack using an Array--------------------------------------------------------------

public class StackUsingArray {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public StackUsingArray(int size) {
        maxSize = size;
        top = -1;
        stackArray = new int[maxSize];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // You can choose a different value to indicate error.
        }
        return stackArray[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek.");
            return -1; // You can choose a different value to indicate error.
        }
        return stackArray[top];
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Size: " + stack.size());
    }
}
