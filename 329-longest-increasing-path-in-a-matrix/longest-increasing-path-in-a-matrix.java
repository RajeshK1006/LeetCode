class Solution {
    int[][] dir = new int[][] {{0,1}, {0,-1}, {1,0}, {-1,0}};
    public int longestIncreasingPath(int[][] matrix) {
        int r = matrix.length;
        int c= matrix[0].length;
        int[][] cache = new int[r][c];
        int maxi= 1;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int len = DFS(matrix,i,j,r,c,cache);
                maxi = Math.max(maxi,len);
            }
        }

        return maxi;
    }

    int DFS(int[][] matrix, int i, int j, int r, int c, int[][] memo){

        if(memo[i][j]!=0){
            return memo[i][j];
        }
        int max = 1;

        for(int k=0;k<4;k++){
            int dirx = dir[k][0] + i;
            int diry = dir[k][1] + j;

            if(dirx<0 || dirx >=r || diry<0 || diry>= c || matrix[dirx][diry]<=matrix[i][j]){
                continue;
            }
            else{
                int len  = 1+DFS(matrix,dirx,diry,r,c,memo);
                max = Math.max(max,len);

            }
        }

        memo[i][j] = max;

        return max;
    }
}