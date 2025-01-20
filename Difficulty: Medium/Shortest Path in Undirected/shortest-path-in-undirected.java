//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int V = sc.nextInt();
            int E = sc.nextInt();
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }

            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                adj.get(u).add(v);
                adj.get(v).add(u); // Since the graph is undirected
            }

            int src = sc.nextInt();

            Solution obj = new Solution();
            int[] res = obj.shortestPath(adj, src);

            for (int i = 0; i < res.length; i++) {
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
        this.node = node;
        this.distance = distance;
    }
}

class Solution {
    // Function to find the shortest path from a source node to all other nodes
    public int[] shortestPath(ArrayList<ArrayList<Integer>> adj, int src) {
        // code here
        int[] dis = new int[adj.size()];
        for(int i=0;i<adj.size();i++){
            dis[i] = (int)(1e9);
        }
        
        dis[src] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>((x,y) -> (x.distance - y.distance));
        
        pq.add(new Pair(0,src));
        
        while(!pq.isEmpty()){
            
            int net_distance = pq.peek().distance;
            int adj_node  = pq.peek().node;
            pq.remove();
            
            for(int num : adj.get(adj_node)){
                if(net_distance + 1 <dis[num]){
                    dis[num] = net_distance + 1;
                    pq.add(new Pair(dis[num], num));
                }
            }
        }
        
        for(int i = 0; i<dis.length;i++){
            if(dis[i] == (int)(1e9)){
                dis[i] = -1;
            } 
        } 
        
        return dis;
        
    }
}
