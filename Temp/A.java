import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

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
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        long mod = (long) (1e9 + 7);


       // BufferedReader in = new BufferedReader(new FileReader("input.txt"));
       // PrintWriter out = new PrintWriter(new FileWriter("outputss.txt"));



        int t = Integer.parseInt(in.readLine());

        StringBuilder sb = new StringBuilder();
        for (int z = 0; z < t; z++) {
            int n = Integer.parseInt(in.readLine());
            // taking array input as string

            // 1D input
            StringTokenizer st = new StringTokenizer(in.readLine());
            StringTokenizer sp = new StringTokenizer(in.readLine());
            int[] a= new int[n];
            int[] b = new int[n];
            //String [] arr = new String[n];


            // Read the array elements
            for (int j = 0; j < n; j++) {
                a[j] = Integer.parseInt(st.nextToken());
                b[j] = Integer.parseInt(sp.nextToken());
                // arr[j] = st.nextToken();
            }
                // 1D end
            //System.out.println("\ntest case :"+(z+1)+"/"+t);
Arrays.sort(a);
Arrays.sort(b);
long ans =1;

int j = n - 1;
for (int i = n - 1; i >= 0; i--) {
    while (j >= 0 && a[j] > b[i]) {
        j--;
    }
    if (i < j) {
        ans =0;
    }
    ans *= (i - j);
    ans %= mod;
}
System.out.println(ans);

            
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
