import java.io.*;
import java.util.*;
import static java.lang.System.out;


public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int t = Integer.parseInt(f.readLine());
        while (t-- > 0) {
         // code here         

        }
        
        f.close();
        out.close();
    }

    public static int[] readArr(int N, BufferedReader f) throws Exception {
        StringTokenizer st = new StringTokenizer(f.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        return arr;
    }

    public static void dbug(int[] arr) {
        // for debugging only
        System.out.println("dbug outout: ");
        for (int x : arr)
            out.print(x + " ");
        out.println();
    }

}
