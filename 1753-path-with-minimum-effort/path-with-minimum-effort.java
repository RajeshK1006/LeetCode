class Solution {
    public int minimumEffortPath(int[][] heights) {

        if (heights.length == 0){
            return 0;
        }
        // since it is a minimization prblem it can be solved by using bfs and pq
        // use minheap for the minimum effort 

        // dijikstra algorithm with lil modification for Bfs
        int maxi = 0;
        int[][] dir = new int[][] {{1,0},{-1,0},{0,1},{0,-1}};

        PriorityQueue<int[]> pq = new PriorityQueue<>((x,y) -> x[0] - y[0]);

        // in currrent cell the effort is 0

        int r = heights.length;
        int c = heights[0].length;
        int[][] visit = new int[r][c];
        pq.offer(new int[] {0,0,0});

        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int effort = curr[0];
            int rr = curr[1];
            int cc = curr[2];

            maxi = Math.max(effort,maxi);

    
            if(rr == r-1 && cc ==c-1){
                return maxi;
            }

             visit[rr][cc] = 1;


            for(int i=0;i<4;i++){
                int nx = dir[i][0] + rr;
                int ny =  dir[i][1] + cc;

                if(nx>=0 && nx< r && ny>=0 && ny<c && visit[nx][ny] == 0){
                    int neweff = Math.abs(heights[nx][ny] - heights[rr][cc]);
                    pq.offer(new int[] {neweff , nx,ny});
                    
                }
            }

        }

        return maxi;
    }
}