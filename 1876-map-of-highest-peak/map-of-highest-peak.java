class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int r = isWater.length;
        int c = isWater[0].length;
        Queue<int[]> q = new LinkedList<>();
        int[][] h = new int[r][c];

        for(int i= 0;i<r;i++){
            for(int j=0;j<c;j++){
                if (isWater[i][j]==1){
                    h[i][j]=0;
                    q.offer(new  int[] {i,j});
                }
                else{
                    h[i][j] = -1;
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

                if(nr <0 || nr>=r || nc<0|| nc>=c || h[nr][nc] != -1 ){
                    continue;
                }

                h[nr][nc] = 1 + h[curr[0]][curr[1]];

                q.offer(new int[] {nr,nc});
            }
        }

        return h;


    }
}