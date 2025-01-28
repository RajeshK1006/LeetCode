class Solution {
    public int closedIsland(int[][] grid) {

        int islands  =0;
        int r = grid.length;
        int c = grid[0].length;

        for(int i=0;i<r;i++){
    
            DFS(grid,i,0,r,c);
            

            
            DFS(grid,i,c-1,r,c);
    
        }

        for(int i=0;i<c;i++){
            
            DFS(grid,0,i,r,c);
            

            
            DFS(grid,r-1,i,r,c);
            
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==0){
                    DFS(grid,i,j,r,c);
                    islands+=1;
                }
            }
        }

        return islands;
        

    }

    void DFS(int[][] grid, int i, int j, int r, int c){


        if(i<0|| i>=r || j<0 || j>=c || grid[i][j]==1){
            return ;
        }

        grid[i][j] = 1;

        DFS(grid,i+1,j,r,c);
        DFS(grid,i-1,j,r,c);
        DFS(grid,i,j+1,r,c); 
        DFS(grid,i,j-1,r,c);

    }
}