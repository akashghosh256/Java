//Permutation of Numbers in Java iterative  approach
// 1 2 3 
// 2 1 3 
// 3 1 2 
// 1 3 2
// 2 3 1
// 3 2 1


// import java.util.Arrays;

// public class Permutation {

//     // Function to swap two elements in an array
//     private static void swap(int[] arr, int i, int j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     // Function to print an array
//     private static void printArray(int[] arr) {
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//         System.out.println();
//     }

//     // Function to generate permutations iteratively
//     public static void generatePermutations(int[] arr) {
//         int n = arr.length;
//         int[] c = new int[n];
//         int i = 0;

//         printArray(arr);
//         // System.out.print("hey");

//         while (i < n) {
//             if (c[i] < i) {
//                 if (i % 2 == 0) {
//                     swap(arr, 0, i);
//                 } else {
//                     swap(arr, c[i], i);
//                 }
//                 printArray(arr);
//                 c[i]++;
//                 i = 0;
//             } else {
//                 c[i] = 0;
//                 i++;
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int[] nums = {1, 2, 3};
//         generatePermutations(nums);
//     }
// }



// Permutation of Numbers in Java recursive approach

// import java.util.Arrays;

// public class Permutation {

//     // Function to swap two elements in an array
//     private static void swap(int[] arr, int i, int j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     // Recursive function to generate permutations
//     private static void generatePermutations(int[] arr, int startIndex, int endIndex) {
//         if (startIndex == endIndex) {
//             // Base case: we have reached the end of the array, so print the permutation
//             System.out.println(Arrays.toString(arr));
//             return;
//         }

//         for (int i = startIndex; i <= endIndex; i++) {
//             // Swap the current element with the element at startIndex
//             swap(arr, startIndex, i);

//             // Recursively generate permutations for the rest of the array
//             generatePermutations(arr, startIndex + 1, endIndex);

//             // Swap back to backtrack and try the next element
//             swap(arr, startIndex, i);
//         }
//     }

//     public static void main(String[] args) {
//         int[] nums = {1, 2, 3};
//         generatePermutations(nums, 0, nums.length - 1);
//     }
// }

// time complexity is O(n!)
// space complexity of the recursive permutation algorithm is O(n!).



// Generate permutations of numbers is to use the "Next Permutation" algorithm.
//The key idea is to find the next permutation by following a series of steps: finding the first decreasing element, swapping it with the smallest element that is larger than it to its right, and reversing the remaining elements.

import java.util.Arrays;

public class Permutation {

    // Function to swap two elements in an array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Function to reverse elements in an array from startIndex to endIndex
    private static void reverse(int[] arr, int startIndex, int endIndex) {
        while (startIndex < endIndex) {
            swap(arr, startIndex, endIndex);
            startIndex++;
            endIndex--;
        }
    }

    // Function to generate permutations using nextPermutation
    public static void generatePermutations(int[] arr) {
        Arrays.sort(arr); // Sort the array initially
        int n = arr.length;

        do {
            System.out.println(Arrays.toString(arr));
        } while (nextPermutation(arr, n));
    }

    // Function to generate next permutation
    private static boolean nextPermutation(int[] arr, int n) {
        int i = n - 2;

        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        if (i < 0) {
            return false; // No more permutations
        }

        int j = n - 1;
        while (arr[j] <= arr[i]) {
            j--;
        }

        swap(arr, i, j);
        reverse(arr, i + 1, n - 1);

        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        generatePermutations(nums);
    }
}
//The time complexity of this approach is O(n! * n), where n is the length of the array, and the space complexity is O(n)















