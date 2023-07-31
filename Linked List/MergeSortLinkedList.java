// Java implementation of Merge Sort for a singly linked list

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeSortLinkedList {
    // Function to perform Merge Sort on a linked list
    public Node mergeSort(Node head) {
        // Base case: If the list is empty or has only one element, it is already sorted
        if (head == null || head.next == null)
            return head;

        // Find the middle node of the list
        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;
        middle.next = null; // Split the list into two parts

        // Recursively sort the left and right halves of the list
        Node left = mergeSort(head);
        Node right = mergeSort(nextOfMiddle);

        // Merge the sorted halves and return the result
        return merge(left, right);
    }

    // Function to merge two sorted linked lists
    private Node merge(Node left, Node right) {
        Node result = null;
        if (left == null)
            return right;
        if (right == null)
            return left;

        // Compare the data of the nodes in both lists and merge them in ascending order
        if (left.data <= right.data) {
            result = left;
            result.next = merge(left.next, right);
        } else {
            result = right;
            result.next = merge(left, right.next);
        }

        return result;
    }

    // Function to find the middle node of the linked list
    private Node getMiddle(Node head) {
        if (head == null)
            return head;

        Node slow = head;
        Node fast = head;

        // Move slow by one step and fast by two steps until fast reaches the end of the list
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        MergeSortLinkedList mergeSortLinkedList = new MergeSortLinkedList();

        // Example usage
        Node head = new Node(30);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new Node(5);

        // Sort the linked list using Merge Sort
        Node sortedList = mergeSortLinkedList.mergeSort(head);

        // Print the sorted linked list
        System.out.println("Sorted Linked List:");
        while (sortedList != null) {
            System.out.print(sortedList.data + " ");
            sortedList = sortedList.next;
        }
    }
}
