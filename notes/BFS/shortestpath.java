class Solution {
    static int[] dirX = new int[] {-1,1,0,0,-1,1,-1,1};
    static int[] dirY = new int[] {0,0,-1,1,-1,-1,1,1};

    public int shortestPathBinaryMatrix(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        if(grid[0][0] == 1 || grid[row-1][col-1]==1){
            return -1;
        }

        

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {0,0,1});

        grid[0][0] = 1;

        while(!q.isEmpty()){
            int[] value = q.poll();
            int x = value[0];
            int y = value[1];
            int length = value[2];

            if(x==row-1 && y==col-1){
                return length;
            }

            for(int i = 0; i<8;i++){
                int nx = x+dirX[i];
                int ny = y+dirY[i];

                if(nx>=0 && nx<row && ny>=0 && ny<col && grid[nx][ny]==0){
                    q.offer(new int[] {nx,ny,length+1});
                    grid[nx][ny] = 1;
                }
            }
        }

        return -1;
    }
}
