class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        boolean[] unsafe = new boolean[graph.length];
        int[] visit = new int[graph.length];
        int[] stack = new int[graph.length];

        for(int i=0;i<graph.length;i++){
            unsafe[i] = DFS(i,graph,visit,stack);
        }

        List<Integer> safe = new ArrayList<>();
        for(int i=0;i<unsafe.length;i++){
            if(unsafe[i]==false){
                safe.add(i);
            }
        }

        return safe;
    }

    boolean DFS(int src,int[][] g,int[] visit, int[] stack){
        // if the src is already in the satc space then cycle is detected
        if(stack[src]==1){
            return true;
        }
        

        // if the src is already visited then it is exploring another path so false
        if (visit[src]==1){
            return false;
        }

        visit[src] = 1;
        stack[src] = 1;

        for(int num : g[src]){
            if(DFS(num,g,visit,stack)){
                return true;
            }
        }

        stack[src] = 0;
        return false;

    } 
}