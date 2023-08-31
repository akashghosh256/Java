import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k)
    {
        ArrayList<Integer> result = new ArrayList<>();
        
        // Create a class to hold elements with their indices for tracking
        class Element {
            int value;
            int arrayIndex;
            int elementIndex;
            
            Element(int value, int arrayIndex, int elementIndex) {
                this.value = value;
                this.arrayIndex = arrayIndex;
                this.elementIndex = elementIndex;
            }
        }
        
        // Create a min heap (priority queue) to store elements from each array
        PriorityQueue<Element> minHeap = new PriorityQueue<>((e1, e2) -> e1.value - e2.value);
        
        // Initialize the heap with the first elements from each array
        for (int i = 0; i < k; i++) {
            if (!kArrays.get(i).isEmpty()) {
                minHeap.offer(new Element(kArrays.get(i).get(0), i, 0));
            }
        }
        
        // Merge the arrays using the min heap
        while (!minHeap.isEmpty()) {
            Element current = minHeap.poll();
            result.add(current.value);
            
            // Add the next element from the same array to the heap
            if (current.elementIndex + 1 < kArrays.get(current.arrayIndex).size()) {
                minHeap.offer(new Element(
                    kArrays.get(current.arrayIndex).get(current.elementIndex + 1),
                    current.arrayIndex,
                    current.elementIndex + 1
                ));
            }
        }
        
        return result;
    }
}