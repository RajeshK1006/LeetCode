import java.util.*;
class Main{
    public static void main(String[] args){
        int n = 5;
        List<List<Integer>> g = new ArrayList<>();
    
        for(int i=0;i<n;i++){
            g.add(new ArrayList<>());
        };
        
        
               // Add edges
        addEdge(g, 0, 1);
        addEdge(g, 0, 2);
        addEdge(g, 1, 3);
        addEdge(g, 3, 4);
        
        
        int src = 0;
        int end = 4;
        int[] visit = new int[n];
        boolean ans = DFS(g,src,end, visit);
        System.out.println(ans);
        
    }
    
    static void addEdge(List<List<Integer>> g, int u, int v){
        g.get(u).add(v);
        g.get(v).add(u);
        
    }
    
    static boolean DFSfosimplepath(List<List<Integer>> g, int src,  int end, int[] visit){
        
        if(src==end){
            return true;
        }
        
        if(visit[src] == 1){
            return false;
        }
        visit[src] = 1;
        
        for(int num: g.get(src)){
            if(DFS(g,num,end,visit)){
                return true;
            }
        }
        
        return false;
    }
    
}
