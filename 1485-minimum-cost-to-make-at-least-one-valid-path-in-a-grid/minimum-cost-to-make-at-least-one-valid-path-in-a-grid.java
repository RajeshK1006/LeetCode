class Solution {
    public int minCost(int[][] grid) {
        int[][] dir = new int[][] {{0,1},{0,-1},{1,0},{-1,0}};
        int r = grid.length;
        int c = grid[0].length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((x,y) -> x[0] - y[0]);
        pq.offer(new int[] {0,0,0});
        int[][] visit = new int[r][c];
        for(int[] arr: visit){
            Arrays.fill(arr,Integer.MAX_VALUE);
        }
        visit[0][0] = 0;
        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int cost = curr[0];
            int rr = curr[1];
            int cc = curr[2];

            if(cost > visit[rr][cc]) continue; 
            // updating the visited paths with maximum values is not necessary 
            // to remove them is very efficient without adding it into the pq

            if(rr == r-1 && cc == c-1){
                return cost;
            }

            for(int i=0;i<4;i++){
                int d = i+1;
                int nx = rr + dir[i][0];
                int ny = cc + dir[i][1];
                int newcost = (d == grid[rr][cc]) ? cost : cost +1;


                if(nx >= 0 && nx <r && ny >=0 && ny <c && grid[rr][cc]!=0 && newcost < visit[nx][ny]){
                    
                    pq.offer(new int[] {newcost , nx, ny});
                    }
                }

                grid[rr][cc] = 0;

                
        }
        return -1;
    }
}