//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntMatrix {
    public static int[][] input(BufferedReader br, int n, int m) throws IOException {
        int[][] mat = new int[n][m];

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().trim().split(" ");
            for (int j = 0; j < m; j++) {
                mat[i][j] = Integer.parseInt(s[j]);
            }
        }

        return mat;
    }

    public static void print(ArrayList<ArrayList<Integer>> m) {
        for (ArrayList<Integer> a : m) {
            for (int e : a) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}

public class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int e = Integer.parseInt(br.readLine());
            int v = Integer.parseInt(br.readLine());

            int[][] edges = IntMatrix.input(br, e, 2);

            Solution obj = new Solution();
            ArrayList<ArrayList<Integer>> res = obj.connectedcomponents(v, edges);
            Collections.sort(res, (a, b) -> Integer.compare(a.get(0), b.get(0)));
            IntMatrix.print(res);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends



class Solution {
    public ArrayList<ArrayList<Integer>> connectedcomponents(int v, int[][] edges) {
        int[] visit = new int[v];
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        List<List<Integer>> g = new ArrayList<>();
        
        for(int i=0;i<v;i++){
            g.add(new ArrayList<>());
        }
        
        for(int[] num: edges){
            int u = num[0];
            int w = num[1];
            
            g.get(u).add(w);
            g.get(w).add(u);
        }
        for(int i=0;i<v;i++){
            if(visit[i]==0){
                ArrayList<Integer> inner = new ArrayList<>();
                DFS(g,i,visit,inner,outer);
                
                Collections.sort(inner);
                if(inner.size()>0){
                    outer.add(inner);
                }
            }
        }
        
        return outer;
    }
    void DFS(List<List<Integer>> g, int src, int[] visit, ArrayList<Integer> inner, ArrayList<ArrayList<Integer>> outer ){
        
        visit[src] = 1;
        inner.add(src);
        
        for(int num : g.get(src)){
            if(visit[num]==0){
                DFS(g,num,visit,inner, outer);
            }
        }
        
    }
}