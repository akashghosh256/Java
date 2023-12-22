class Solution
{
    static int[] bellman_ford(int V, ArrayList<ArrayList<Integer>> adj, int S)
    {
        int dist[] = new int[V];
        
        Arrays.fill(dist, 100000000);
        
        dist[S] = 0;
        
        for(int i=0; i<V-1; i++)
        {
            for(ArrayList<Integer> pair : adj)
            {
                int x = pair.get(0);
                int y = pair.get(1);
                int cost = pair.get(2);
                
                if(dist[x] + cost < dist[y])
                {
                    dist[y] = dist[x] + cost;
                }
                
            }
        }
        
            for(int i=0; i<V-1; i++)
        {
            for(ArrayList<Integer> pair : adj)
            {
                int x = pair.get(0);
                int y = pair.get(1);
                int cost = pair.get(2);
                
                if(dist[x] !=100000000 && dist[x] + cost < dist[y])
                {
                     int ar[] = {-1};
                    return ar;
                }
                
            }
        }
        
        
        return dist;
        
        
    }
}