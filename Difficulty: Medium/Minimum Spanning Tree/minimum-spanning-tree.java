//{ Driver Code Starts


import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static PrintWriter ot;

    public static void main(String args[]) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int V = Integer.parseInt(br.readLine().trim());
            int E = Integer.parseInt(br.readLine().trim());
            List<List<int[]>> list = new ArrayList<>();
            for (int i = 0; i < V; i++) list.add(new ArrayList<>());
            for (int i = 0; i < E; i++) {
                String[] s = br.readLine().trim().split(" ");
                int a = Integer.parseInt(s[0]);
                int b = Integer.parseInt(s[1]);
                int c = Integer.parseInt(s[2]);
                list.get(a).add(new int[] {b, c});
                list.get(b).add(new int[] {a, c});
            }
            ot.println(new Solution().spanningTree(V, E, list));

            ot.println("~");
        }
        ot.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Pair{
    int node;
    int wt;
    
    public Pair(int wt, int node){
        this.wt = wt;
        this.node = node;
    }
}

class Solution {
    static int spanningTree(int V, int E, List<List<int[]>> adj) {
        // Code Here.
        PriorityQueue<Pair> pq = new PriorityQueue<>((x,y) -> x.wt - y.wt);
        
        int[] visit = new int[V];
        pq.offer(new Pair(0,0));
        int sum = 0;
        
        while(!pq.isEmpty()){
            Pair curr = pq.poll();
            int node = curr.node;
            int wt = curr.wt;
            
            if(visit[node]==1 ) continue;
            
            visit[node] = 1;
            sum += wt;
            
            for(int[] edges : adj.get(node)){
                int next_node = edges[0];
                int weight = edges[1];
                
                if(visit[next_node]==1) continue;
                
                pq.offer(new Pair(weight,next_node));
            }
        }
        
        return sum;
    }
}