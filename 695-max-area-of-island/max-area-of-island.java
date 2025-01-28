class Solution {
    public int maxAreaOfIsland(int[][] grid) {

        int r = grid.length;
        int c = grid[0].length;
        int maxi = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j] == 1){
                    int[] cnt = new int[1]; 
                    DFS(grid, i,j,r,c,cnt);
                    maxi = Math.max(maxi, cnt[0]);
                }
            }
        }

        return maxi;
        
    }

    void DFS(int[][] grid, int i, int j, int r, int c, int[] cnt){
        if(i<0||i>=r||j<0||j>=c||grid[i][j]==0){
            return;
        }

        cnt[0] += 1;
        grid[i][j] = 0;

        DFS(grid,i-1,j,r,c,cnt);
        DFS(grid,i+1,j,r,c,cnt);
        DFS(grid,i,j-1,r,c,cnt);
        DFS(grid,i,j+1,r,c,cnt);


    }
}