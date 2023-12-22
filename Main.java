import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        ForkJoinPool pool = new ForkJoinPool();
        SumTask task = new SumTask(array, 0, array.length);

        int result = pool.invoke(task);
        System.out.println("Sum: " + result);
    }
}

class SumTask extends RecursiveTask<Integer> {
    private static final int THRESHOLD = 2;
    private int[] array;
    private int start;
    private int end;

    public SumTask(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if (end - start <= THRESHOLD) {
            int sum = 0;
            for (int i = start; i < end; i++) {
                sum += array[i];
            }
            return sum;
        } else {
            int middle = (start + end) / 2;
            SumTask leftTask = new SumTask(array, start, middle);
            SumTask rightTask = new SumTask(array, middle, end);

            leftTask.fork();
            int rightResult = rightTask.compute();
            int leftResult = leftTask.join();

            return leftResult + rightResult;
        }
    }
}


// Sure, let's walk through a dry run of the provided Java code to calculate the sum of an array using 
// the fork-join framework. We'll use a simplified example with a small array of integers:

// ```java
// int[] array = {1, 2, 3, 4};
// ```

// Now, we 
// will perform a step-by-step dry run of the code:

// 1. Initialize the array:

//    `int[] array = {1, 2, 3, 4};`

// 2. 
// Create a ForkJoinPool:

//    `ForkJoinPool pool = new ForkJoinPool();`

// 3. Create a `SumTask` object for the entire array:

//    `SumTask 
// task = new SumTask(array, 0, 4);`

//    Here, `0` is the start index, and `4` is the end index of 
// the array segment to be processed.

// 4. Start computing the sum:

//    The `compute` method of the `SumTask` object is called 
// with the range `[0, 4]`. Since the size of the segment (4 elements) is greater than the `THRESHOLD` (2), it divides 
// the task into two subtasks:

//    - Subtask 1: `SumTask(array, 0, 2)` for the left half of the array.
   
// - Subtask 2: `SumTask(array, 2, 4)` for the right half of the array.

// 5. Fork the left subtask:

//    Subtask 1 
// (`SumTask(array, 0, 2)`) is forked, meaning it is scheduled to run asynchronously.

// 6. Compute the right subtask:

//    Subtask 2 (`SumTask(array, 
// 2, 4)`) directly calculates the sum of the elements in its segment. It returns 3 (2 + 1).

// 7. Join the left 
// subtask:

//    The main task waits for Subtask 1 to complete and then joins the result. Subtask 1 calculates the sum of 
// the left half of the array (1 + 2) and returns 3.

// 8. Combine the results:

//    The main task adds 
// the results of Subtask 1 (3) and Subtask 2 (3) to get the final sum for the entire array:

   
// `Sum = Subtask 1 result + Subtask 2 result = 3 + 3 = 6`

// 9. Print the result:

//    The 
// code prints the sum of the array to the console:

//    ```
//    Sum: 6
//    ```

// So, in 
// this dry run, we divided the array into smaller subtasks, calculated the sum of each subtask in parallel, and combined the 
// results to obtain the final sum of the array. This demonstrates the parallel processing capability of the fork-join framework in Java. 