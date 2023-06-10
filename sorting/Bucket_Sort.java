// Bucket sort is mainly useful when input is uniformly distributed over a 
// range. For example, consider the following problem. 
// Sort a large set of floating point numbers which are in range 
// from 0.0 to 1.0 and are uniformly distributed across the range.


// why its recommend to use insertion sort to sort a bucket list in bucket sort algorithm?
// insertion sort is recommended for sorting bucket lists 
// in the bucket sort algorithm because it has a good average-case time 
//  for small lists, is relatively simple to implement, and can 
// be performed in-place, which can be advantageous in certain applications.



// Java program to sort an array
// using bucket sort
import java.util.*;
import java.util.Collections;

class Bucket_Sort {

	// Function to sort arr[] of size n
	// using bucket sort
	static void bucketSort(float arr[], int n)
	{
		if (n <= 0)
			return;

		// 1) Create n empty buckets
		@SuppressWarnings("unchecked")
		Vector<Float>[] buckets = new Vector[n];

		for (int i = 0; i < n; i++) {
			buckets[i] = new Vector<Float>();
		}

		// 2) Put array elements in different buckets
		for (int i = 0; i < n; i++) {
			float idx = arr[i] * n;
			buckets[(int)idx].add(arr[i]);
		}

		// 3) Sort individual buckets
		for (int i = 0; i < n; i++) {
			Collections.sort(buckets[i]);
		}

		// 4) Concatenate all buckets into arr[]
		int index = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < buckets[i].size(); j++) {
				arr[index++] = buckets[i].get(j);
			}
		}
	}

	// Driver code
	public static void main(String args[])
	{
		float arr[] = { (float)0.897, (float)0.565,
						(float)0.656, (float)0.1234,
						(float)0.665, (float)0.3434 };

		int n = arr.length;
		bucketSort(arr, n);

		System.out.println("Sorted array is ");
		for (float el : arr) {
			System.out.print(el + " ");
		}
	}
}


// In the best-case scenario, where all the elements are uniformly distributed across the 
// buckets, bucket sort can achieve a linear time complexity of O(n), where n is the 
// total number of elements in the array. This is because each bucket contains a 
// constant number of elements, and the sorting algorithm used to sort the buckets can be 
// performed in linear time.

// In the worst-case scenario, where all the elements are clustered in a few buckets, 
// the time complexity of bucket sort can be as bad as O(n^2), which is the worst-case 
// time complexity of the sorting algorithm used to sort the buckets. This can happen 
// when the bucket function maps many elements to the same bucket, resulting in a large 
// number of elements to be sorted in that bucket.

// In practice, the time complexity of bucket sort is often somewhere in between O(n) 
// and O(n^2), depending on the distribution of the elements in the input array and 
// the efficiency of the sorting algorithm used to sort the buckets.