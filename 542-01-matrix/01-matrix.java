class Solution {
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> q = new LinkedList<>();
        int r = mat.length;
        int c = mat[0].length;
        for(int i= 0;i<r;i++){
            for(int j=0;j<c;j++){
                if (mat[i][j]==0){
                    q.offer(new  int[] {i,j});
                }
                else{
                    mat[i][j] = -1;
                }
            }
        }

        int[] dirX = new int[] {1,-1,0,0};
        int[] dirY  = new int[] {0,0,1,-1};

        while(!q.isEmpty()){
            int[] curr = q.poll();

            for(int i=0;i<4;i++){
                int nr = curr[0] + dirX[i];
                int nc = curr[1] + dirY[i];

                if(nr <0 || nr>=r || nc<0|| nc>=c || mat[nr][nc] != -1 ){
                    continue;
                }

                mat[nr][nc] = 1 + mat[curr[0]][curr[1]];

                q.offer(new int[] {nr,nc});
            }
        }

        return mat;
    }
}