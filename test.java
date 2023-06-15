import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        // Read the number of rows and columns
        StringTokenizer st = new StringTokenizer(in.readLine());
        // int rows = Integer.parseInt(st.nextToken());
        // int cols = Integer.parseInt(st.nextToken());

        // Initialize the matrix
        int[][] matrix = new int[rows][cols];

        // Read and store the matrix elements
        for (int i = 0; i < rows; i++) {
            st = new StringTokenizer(in.readLine());
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }
            System.out.println("Hello World");
        // Print the matrix for verification
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Close the reader
        in.close();
    }
}
