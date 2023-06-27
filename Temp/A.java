import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
       // BufferedReader in = new BufferedReader(new FileReader("input.txt"));
      //  PrintWriter out = new PrintWriter(new FileWriter("outputss.txt"));



        int t = Integer.parseInt(in.readLine());

     //   StringBuilder sb = new StringBuilder();
        for (int z = 0; z < t; z++) {

            int n = Integer.parseInt(in.readLine());
            // taking array input as string

            // 1D input
            StringTokenizer st = new StringTokenizer(in.readLine());
            int[] arr = new int[n];
            //String [] arr = new String[n];


            // // Read the array elements
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
               //  arr[j] = st.nextToken();
            }
                // 1D end
           //  System.out.println("first Go: ");
                if(n==1)
                System.out.println("0");
      
            else{
                Arrays.sort(arr);
                int sum =0;
                for(int i=0;i<n/2;i++){
                    sum+=(arr[n-i-1] - arr[i]);
                }
               



                //int sum=(arr[n-1] - arr[0]) + (arr[n-2] - arr[1]);
                System.out.println(sum);
            }









        // // 2D array input
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
        // // 2D end


        // Process the array as needed
        // sb.append("Hello World\n"); // Example output
        // System.out.print(sb.toString());
        // System.out.println(Arrays.toString(arr));


        }
        // Close the reader
        in.close();
    }
}
