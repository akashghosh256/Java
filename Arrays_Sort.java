import java.util.ArrayList;
import java.util.List;

public class Arrays_Sort {
 use -> https://leetcode.com/problems/merge-intervals/

 List<int[]> mergedIntervals = new ArrayList<>();
 
   int[][] intervals = {
            {2, 10},
            {2, 5},
            {4, 7},
            {6, 8}
        };

Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
Sorting process:

The sorting algorithm compares the first elements of each subarray and 
rearranges the array accordingly.

When the first elements are the same, the second elements are considered 
for comparison.

After sorting, the array becomes:
After sorting:
[2, 5]
[2, 10]
[4, 7]
[6, 8]


}
