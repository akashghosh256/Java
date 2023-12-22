
https://practice.geeksforgeeks.org/problems/implementing-dijkstra-set-1-adjacency-matrix/1
class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int v, ArrayList<ArrayList<ArrayList<Integer>>> adj, int s)
    {
        // Write your code here
        // we will be using a min heap which will be sorted based on the distance
        
        int [] distance = new int [v];
        Arrays.fill(distance, Integer.MAX_VALUE);
        
        PriorityQueue<Pair> minHeap = new PriorityQueue<>((p1, p2) -> Integer.compare(p1.weight, p2.weight));
        
        distance[s] = 0;
        minHeap.offer(new Pair(s, 0));  // Stores short weight of the path  in top
        
        while (!minHeap.isEmpty()) {
            
            Pair currentPair = minHeap.poll();
            
            int currentNode = currentPair.vertex;
            int currentDistance = currentPair.weight;
            
            ArrayList<ArrayList<Integer>> children = adj.get(currentNode);
            
            for (ArrayList<Integer> child : children) {
                if (distance[currentNode] + child.get(1) < distance[child.get(0)]) {
                    distance[child.get(0)] = distance[currentNode] + child.get(1);
                    minHeap.offer(new Pair(child.get(0), distance[child.get(0)]));
                }
            }
        }
        return distance;
    }
}