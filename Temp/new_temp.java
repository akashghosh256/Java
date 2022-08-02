
/*  

min = Math.min(min, i);
max = Math.max(max, i);
long ans = Long.MIN_VALUE; ans=113333356..
BigInteger f = new BigInteger("1"); // Or BigInteger.ONE
f = f.multiply(BigInteger.valueOf(i));  or divide/add...
 

PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {
@Override

boolean[] used = new boolean[k];
    for(char i: s) {
            if(i != '?') {
                used[i-'a'] = true;
            }
    }

int[][] queries = new int[m][4];
TreeSet<Integer> set = new TreeSet<>();
ArrayList<Character> chars = new ArrayList<>();
ArrayList<Integer> segments = new ArrayList<>();


  INPUT-------------------------------------

   int n = Integer.parseInt(f.readLine());
   char[] a = f.readLine().toCharArray(); 

   StringTokenizer st = new StringTokenizer(f.readLine());  // This line alone takes string input *Remember
  { st = new StringTokenizer(f.readLine());  // To get input numbers eg: 1 2 3
    int a = Integer.parseInt(st.nextToken());// to use one number one by one from 1 2 3
       // if you want to put in array after inputting all numbers use:
        
        int[] a = new int[n];
            for(int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
       int[] a = new int[m];
            for(int i = 0; i < m; i++) {
                a[i] = Integer.parseInt(st.nextToken())-1;
            } 
    }

    int[] doors = new int[3];
            for(int i = 0; i < 3; i++) {
                doors[i] = Integer.parseInt(st.nextToken())-1;
            }

    OUTPUT------------------------------------

    StringBuilder res = new StringBuilder();
        for(int i = 0; i < chars.size(); i++) {
            res.append(String.valueOf(chars.get(i)).repeat(segments.get(i)));
    OR      res.append("47".repeat(b));
        }
        out.println(res);

    out.println("YES"+t); 
    out.println("NO");
    out.println(flag ? "Yes" : "No");
    out.println((rows >= n && flagRow) || (cols >= m && flagCol) ? "Yes" : "No");
    out.println(suff[t-1]-suff[s-1]);
    out.println((long) (i+1)*(i+2)*(i+2)-i);
    

 */

//------------------------------------------------------------------------------
import java.io.*;
import java.util.*;
import static java.lang.System.out;
//-------------------------------------------------------------------------------
//import static java.lang.Math.max;
//import static java.lang.Math.min;
//import static java.lang.Math.abs;
//import java.math.BigInteger;   
//-------------------------------------------------------------------------------

public class new_temp {
    public static void main(String[] args) throws IOException {
        // BufferedReader f = new BufferedReader(new FileReader("uva.in"));
        // PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("threesum.out")));
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int t = Integer.parseInt(f.readLine());
        while (t-- > 0) {
            /*
             * // If 2 or more digits to take as input
             * StringTokenizer st = new StringTokenizer(f.readLine());
             * int a1 = Integer.parseInt(st.nextToken());
             * int a2 = Integer.parseInt(st.nextToken());
             * int a3 = Integer.parseInt(st.nextToken());
             * int a4 = Integer.parseInt(st.nextToken());
             */

            // int[] ant = readArr(array_size,f); // for array input, just put array size;

            // code here

        }
        // at the end of main class
        // out.println(final_ans) // according to question output the final answer
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

    public static void print(int[] arr) {
        // for debugging only
        System.out.println("printing array: ");
        for (int x : arr)
            out.print(x + " ");
        out.println();
    }

}