class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int[] visit = new int[n];
        int pro =0;
        for(int i=0;i<n;i++){
            if(visit[i]==0){
                DFS(isConnected,i,visit);
                pro +=1;
            }
        }

        return pro;
    }

    void DFS(int[][] grid, int src, int[] visit){
        visit[src] = 1;

        for(int i=0;i<grid.length;i++){
            if (grid[src][i]==1 && visit[i]==0){
                DFS(grid,i,visit);
            }
        }
    }
}