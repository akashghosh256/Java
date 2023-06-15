import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class template {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(in.readLine());

        StringBuilder sb = new StringBuilder();
        for (int z = 0; z < t; z++) {
            
            // 1D input
            // int n = Integer.parseInt(in.readLine());
            // taking array input as string
            // StringTokenizer st = new StringTokenizer(in.readLine());
            // int[] arr = new int[n];
            // String [] arr = new String[n];
            
            //  converting string to int
            // for (int j = 0; j < n; j++) {
            //     //arr[j] = Integer.parseInt(st.nextToken());
            //      arr[j] = st.nextToken();
            // }
                // 1D end

        // 2D array input
        StringTokenizer st = new StringTokenizer(in.readLine());
        int rows = Integer.parseInt(st.nextToken());
        int cols = Integer.parseInt(st.nextToken());

        // Initialize the matrix
        int[][] matrix = new int[rows][cols];

        // Read and store the matrix elements
        for (int i = 0; i < rows; i++) {
           st = new StringTokenizer(in.readLine());
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }
            System.out.println("Matrix is: ");
        // Print the 2D matrix for verification
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // 2D end


        // Process the array as needed
        sb.append("Hello World\n"); // Example output
        System.out.print(sb.toString());
        // System.out.println(Arrays.toString(arr));


        }
        // Close the reader
        in.close();
    }
}
