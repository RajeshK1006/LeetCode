class Solution {
    public int[][] allCellsDistOrder(int r, int c, int rCenter, int cCenter) {
        int[][] result = new int[r*c][2];
        PriorityQueue<int[]> pq = new PriorityQueue<>((x,y) -> x[0] - y[0]);

        for(int i =0 ; i<r;i++){
            for(int j = 0;j<c;j++){
                int distance = Math.abs(i-rCenter) + Math.abs(j-cCenter);
                int[] curr = new int[3];
                curr[0] = distance;
                curr[1] = i;
                curr[2] = j;
                pq.offer(curr);
            }
        }

        int i = 0; 
        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int[] ele = new int[2];
            ele[0] = curr[1];
            ele[1] = curr[2];

            result[i++] = ele;
        }

        return result;

    


    }
}