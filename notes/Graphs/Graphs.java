// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// learnt 
// dfs
// /bfs
// degrees cncepts
// union find vv imp


import java.util.*;

class Graph{
    private Map<Integer, List<Integer>> adjList;
    
    public  Graph(){
        this.adjList  = new HashMap<>();
    }
    
    public void addVertex(int v){
        this.adjList.putIfAbsent(v,new ArrayList<>());
    }
    
    public void addEdge(int source, int des){
        this.adjList.putIfAbsent(source,new ArrayList<>());
        this.adjList.putIfAbsent(des,new ArrayList<>());
        this.adjList.get(source).add(des);
        this.adjList.get(des).add(source);
    }
    
    public void bfs(int source){
        Queue<Integer> q = new LinkedList<>();
        q.offer(source);
        Set<Integer> visited = new HashSet<>();
        visited.add(source);
        while(!q.isEmpty()){
            int vertex = q.poll();
            System.out.print(vertex + " ");
            
            for(int num : this.adjList.get(vertex)){
                if(!visited.contains(num)){
                    q.offer(num);
                    visited.add(num);
                }
            }
        }
        
        System.out.println();
    }
    
    public void dfs(int source){
        Stack<Integer> s = new Stack<>();
        Set<Integer> visited = new HashSet<>();
        
        s.push(source);
        visited.add(source);
        while(!s.isEmpty()){
            int vertex = s.pop();
            System.out.print(vertex + " ");
            
            for(int num : this.adjList.get(vertex)){
                if(!visited.contains(num)){
                    s.push(num);
                    visited.add(num);
                }
            }
        }
        System.out.println(" ");
    }
}
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        Graph graph = new Graph();
        for(int i=0;i<7;i++){
            graph.addVertex(i);
        }
        
        
        
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);
        
        graph.bfs(0);
        graph.dfs(0);
    }
}
