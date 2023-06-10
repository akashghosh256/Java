import java.util.Arrays;

public class Counting_Sort {
    public static void main(String[] args) {
        int[] arr = {100,5, 3, 2, 7, 8, 4, 1, 6};
        System.out.println("Original array: " + Arrays.toString(arr));
        countingSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void countingSort(int[] arr) {
        int k = getMax(arr) + 1; // k is the maximum element in the input array plus one
        int[] count = new int[k]; // create count array of size k
        int[] output = new int[arr.length];

        // Count the frequency of each element in the input array
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Build the cumulative count array
        int[] cumulativeCount = new int[k];
        cumulativeCount[0] = 0;
        for (int i = 1; i < k; i++) {
            cumulativeCount[i] = cumulativeCount[i-1] + count[i-1];
        }

        // Traverse the input array again, use cumulative count array to determine position of each element in sorted output
        for (int i = 0; i < arr.length; i++) {
            output[cumulativeCount[arr[i]]] = arr[i];
            cumulativeCount[arr[i]]++;
        }

        // Copy the sorted output back to the original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    public static int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
