class Solution {
    int find(int val,int[] parent){
        if (parent[val] == val){
            return val;
        }
        return find(parent[val],parent);

    }

    public int[] findRedundantConnection(int[][] edges) {
        int[] parent = new int[edges.length+1];
        for(int i=0;i<parent.length;i++){
            parent[i] = i;
        }

        int[] res = new int[] {0,0};

        for(int i=0;i<edges.length;i++){
            int parent_u = find(edges[i][0],parent);
            int parent_v = find(edges[i][1],parent);

            if (parent_v == parent_u){
                return edges[i];
            }
            else{
                parent[parent_u] = parent_v;
            }
        }
        return new int[] {};
    }
}