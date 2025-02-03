class Solution {
    public int countServers(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;

        int[] row = new int[r];
        int[] col = new int[c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    row[i]+=1;
                    col[j]+=1;
                }
            }
        }

        int cnt = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    if(row[i]==1 && col[j]==1) continue;
                    cnt+=1;
                }
            }
        }
        return cnt;
    }
}