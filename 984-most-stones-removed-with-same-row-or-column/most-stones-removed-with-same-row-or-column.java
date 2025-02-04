class Solution {
    private int c=0;
    int find(int x, int[] parent){
        if (parent[x]==0){
            parent[x] = x;
            c++;
        }

        if (parent[x]!=x){
            parent[x] = find(parent[x],parent);
        }

        return parent[x];

        
    }
    public int removeStones(int[][] stones) {
        int[] parent = new int[20003];

        for(int[] pos : stones){
            int parent_r = find(pos[0]+1,parent);
            int parent_c = find(pos[1]+10002,parent);

            if (parent_r!=parent_c){
            parent[parent_c] = parent_r;
            c--;
            }
        }

        return stones.length - c;
    }
}