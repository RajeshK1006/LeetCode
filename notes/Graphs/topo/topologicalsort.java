// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        List<List<Integer>> adj = new ArrayList<>();
        int n = 6; 
        for(int i=0; i<n;i++){
            adj.add(new ArrayList<>());
        }
        
        adj.get(0).add(1);
        adj.get(1).add(4);
        adj.get(1).add(2);
        adj.get(2).add(5);
        adj.get(3).add(0);
        
        
        int[] orders = toposort(adj);
        System.out.println("The topological order of the given DAG is : ");
        System.out.println(Arrays.toString(orders));
        
        
        
    }
    
    static int[] toposort(List<List<Integer>> g){
        int n = g.size();
        int[] visit = new int[n];
        int[] order  = new int[n];
        int index = n-1;
        
        for(int i=0;i<n;i++){
            
            if(visit[i]==0){
                List<Integer> visited_nodes = new ArrayList<>();
                DFS(i,visit, visited_nodes, g);
                for(int node : visited_nodes){
                    order[index] = node;
                    index--;
                }
            }
        }
        
        return order;
    }
    
    static void DFS(int index, int[] visit, List<Integer> nodes, List<List<Integer>> g){
        visit[index] = 1;
        
        for(int num : g.get(index)){
            if (visit[num]==0){
                DFS(num, visit, nodes,g);
            }
        }
        nodes.add(index);
    }
}
