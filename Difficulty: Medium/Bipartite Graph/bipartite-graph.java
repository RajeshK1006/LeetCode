//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] S = br.readLine().trim().split(" ");
            int V = Integer.parseInt(S[0]);
            S = br.readLine().trim().split(" ");
            int E = Integer.parseInt(S[0]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<Integer>());
            }
            for (int i = 0; i < E; i++) {
                String[] s = br.readLine().trim().split(" ");
                int u = Integer.parseInt(s[0]);
                int v = Integer.parseInt(s[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isBipartite(adj);
            if (ans)
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    
    private boolean check(int src, int V,ArrayList<ArrayList<Integer>> adj, int[] color) {
        
        Queue<Integer> q = new LinkedList<>();
        q.offer(src);
        color[src] = 0;
        
        while(!q.isEmpty()){
            int curr = q.poll();
            
            for(int num:adj.get(curr)){
                if (color[num]==color[curr]){
                    return false;
                }
                
                if(color[num]==-1){
                color[num] = 1 - color[curr];
                q.offer(num);
                }
            }
        }
        
        return true;
        
        
        
        
    }
    public boolean isBipartite(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int V = adj.size();
        int[] color = new int[V];
        Arrays.fill( color , -1);
        
        for(int i=0;i<V;i++){
            if(color[i]==-1){
                if(check(i,V, adj,color)==false){
                    return false;
                }
            }
        }
        
        return true;
    }
}