public class Solution {
    public static String graphColoring(int[][] mat, int m) {
        int n = mat.length; // Number of vertices in the graph

        // Initialize an array to store the color assignments for each vertex
        int[] color = new int[n];

        // Start coloring the graph from vertex 0
        if (graphColoringUtil(mat, color, m, 0)) {
            return "YES"; // No valid coloring is possible
        }
        return "NO";

       
    }

    // Recursive function to assign colors to vertices using backtracking
    private static boolean graphColoringUtil(int[][] mat, int[] color, int numColors, int vertex) {
        int n = mat.length; // Number of vertices in the graph

        // Base case: All vertices are colored
        if (vertex == n) {
            return true;
        }

        // Try all colors for the current vertex
        for (int c = 1; c <= numColors; c++) {
            if (isSafe(mat, color, vertex, c)) {
                color[vertex] = c; // Assign color 'c' to the vertex

                // Recur for the next vertex
                if (graphColoringUtil(mat, color, numColors, vertex + 1)) {
                    return true;
                }

                color[vertex] = 0; // Backtrack: Reset color to unassigned
            }
        }

        return false; // No valid coloring found
    }

    // Function to check if a color can be assigned to a vertex
    private static boolean isSafe(int[][] mat, int[] color, int vertex, int c) {
        int n = mat.length; // Number of vertices in the graph

        // Check if the color 'c' is used by adjacent vertices
        for (int i = 0; i < n; i++) {
            if (mat[vertex][i] == 1 && color[i] == c) {
                return false;
            }
        }
        return true;
    }

   
}
