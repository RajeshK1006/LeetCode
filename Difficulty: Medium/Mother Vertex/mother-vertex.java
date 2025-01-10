//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
            for(int i = 0; i < V; i++)
                adj.add(i, new ArrayList<Integer>());
            for(int i = 0; i < E; i++){
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
            }
            Solution obj = new Solution();
            int ans = obj.findMotherVertex(V, adj);
            System.out.println(ans);
       
System.out.println("~");
}
    }
}
// } Driver Code Ends



class Solution
{
    //Function to find a Mother Vertex in the Graph.
    public int findMotherVertex(int V, ArrayList<ArrayList<Integer>>adj)
    {
        // Code here
        int[] visited = new int[V];
        int lastseen = -1;
        for(int i=0;i<V;i++){
            if(visited[i]==0){
                DFS(adj,i,visited);
                lastseen = i;
            }
        }
        
        Arrays.fill(visited,0);
        
        DFS(adj,lastseen,visited);
        
        for(int num : visited){
            if (num!=1){
                return -1;
            }
        }
        
        
        return lastseen;
    }
    
    void DFS(ArrayList<ArrayList<Integer>>adj, int src,int[] visited){
        visited[src] = 1;
        for(int num: adj.get(src)){
            if (visited[num]==0){
                DFS(adj,num,visited);
            }
        }
    }
}