//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] edge = new int[m][3];
            for (int i = 0; i < m; i++) {
                edge[i][0] = sc.nextInt();
                edge[i][1] = sc.nextInt();
                edge[i][2] = sc.nextInt();
            }
            Solution obj = new Solution();
            int res[] = obj.shortestPath(n, m, edge);
            for (int i = 0; i < n; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println();

            System.out.println("~");
        }
    }
}
// } Driver Code Ends

class Pair{
    int node; 
    int distance;
    
    public Pair(int distance, int node){
        this.distance = distance;
        this.node = node;
    }
}

// User function Template for Java
class Solution {

    public int[] shortestPath(int V, int E, int[][] edges) {
        
        List<List<Pair>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[] edge :edges){
            int u = edge[0];
            int v = edge[1];
            int weight = edge[2];
            
            adj.get(u).add(new Pair(weight,v));
            
        }
        // Code here
        int[] dis  = new int[V];
        Arrays.fill(dis , (int) (1e9));
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((x,y) -> x.distance - y.distance);
        
        dis[0] = 0;
        pq.add(new Pair(0,0));
        
        while(!pq.isEmpty()){
            Pair current = pq.poll();
            int distance_so_far = current.distance;
            int adj_node = current.node;
            
            for(Pair num : adj.get(adj_node)){
                int calculated_distance = distance_so_far + num.distance;
                if(calculated_distance < dis[num.node]){
                    dis[num.node] = calculated_distance;
                    pq.add(new Pair(dis[num.node], num.node));
                }
            }
        }
        
        for(int i = 0; i<V;i++){
            if (dis[i] == (int)(1e9)){
                dis[i] = -1;
            }
        }
        
        return dis;
    }
    
}