import java.io.*;
import java.util.*;


public class A {
    
    // Demo function
//      public static int gcd(int a, int b){
//   // HCF or GCD of two numbers
//     while (b != 0) {
//         int temp = b;
//         b = a % b;
//         a= temp;
//     }
//      return a;
//  }
    static class Pair {
        int first, second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }


     static int gcd(int a, int b)   //HCF
    {
        // stores minimum(a, b)
        int i;
        if (a < b)
            i = a;
        else
            i = b;
 
        // take a loop iterating through smaller number to 1
        for (; i > 1; i--) {
 
            // check if the current value of i divides both
            // numbers with remainder 0 if yes, then i is
            // the GCD of a and b
            if (a % i == 0 && b % i == 0)
                return i;
        }

         // if there are no common factors for a and b other
        // than 1, then GCD of a and b is 1
        return 1;
    }












     static final long mod = 1000000007;

    public static void main(String[] args) throws IOException {

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));


       // BufferedReader in = new BufferedReader(new FileReader("input.txt"));
       // PrintWriter out = new PrintWriter(new FileWriter("outputss.txt"));



        int TEST = Integer.parseInt(in.readLine());
        int test_no = 1;

        StringBuilder sb = new StringBuilder();
        while(TEST-- > 0){
            int n = Integer.parseInt(in.readLine());
            String str = in.readLine();
            // taking array input as string

            // // 1D input
            // StringTokenizer st = new StringTokenizer(in.readLine());
            // int[] a = new int[n];
            // //String [] arr = new String[n];


            // // Read the array elements
            // for (int j = 0; j < n; j++) {
            //     a[j] = Integer.parseInt(st.nextToken());
            //     // arr[j] = st.nextToken();
            // }
                // 1D end

      
            System.out.println("\ntest case :"+test_no++);
            System.out.println(gcd(5,10));




        // 2D array input
        // StringTokenizer st = new StringTokenizer(in.readLine());
        // int rows = Integer.parseInt(st.nextToken());
        // int cols = Integer.parseInt(st.nextToken());

        // // Initialize the matrix
        // int[][] matrix = new int[rows][cols];

        // // Read and store the matrix elements
        // for (int i = 0; i < rows; i++) {
        //    st = new StringTokenizer(in.readLine());
        //     for (int j = 0; j < cols; j++) {
        //         matrix[i][j] = Integer.parseInt(st.nextToken());
        //     }
        // }
        //     out.println("Matrix is: ");
        // // Print the 2D matrix for verification
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         out.print(matrix[i][j] + " ");
        //     }
        //     out.println();
        // }
        // 2D end


        // Process the array as needed
      //  sb.append("Hello World\n"); // Example output
      //  System.out.print(sb.toString());
        // System.out.println(Arrays.toString(arr));


        }
        // Close the reader
        in.close();
    }
}
