class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> adj = new ArrayList<>();
        int n = graph.length;
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<n;i++){
            for(int j =0;j<graph[i].length;j++){
                adj.get(i).add(graph[i][j]);
            }
        }

        List<List<Integer>> outer = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        DFS(adj,0,n-1,outer,inner);

        return outer;

    }

    void DFS(List<List<Integer>> adj, int src,int des, List<List<Integer>> outer,List<Integer> inner){
        inner.add(src);
        if(src==des){
            outer.add(new ArrayList<>(inner));
        }
        
        

        for(int num: adj.get(src)){
            
            DFS(adj,num, des,outer, inner);
        }
        inner.remove(inner.size()-1);
    }
}