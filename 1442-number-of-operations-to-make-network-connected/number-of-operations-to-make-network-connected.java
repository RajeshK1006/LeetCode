class Solution {
    // private int count = 0;
    int find(int val, int[] parent){
        if (parent[val]!=val){
            parent[val] = find(parent[val],parent);
        }

        return parent[val];
    }

    void union(int x, int y, int[] parent){
        int rootx = find(x,parent);
        int rooty = find(y,parent);

        if (rootx!= rooty){
            parent[rooty] = rootx;
        }
        
    }

    public int makeConnected(int n, int[][] connections) {
        if (connections.length<(n-1)){
            return -1;
        }

        int[] parent = new int[n];

        for(int i=0;i<n;i++){
            parent[i] = i;
        }
        
        for(int[] con : connections){
            union(con[0],con[1],parent);
        }

        // check for the connected components
        int count = 0;
        for(int i=0;i<n;i++){
            if (parent[i] == i){
                count +=1;
            }
        }

        return count -1;

    }
}