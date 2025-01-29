class Solution {    
    boolean check(int src,List<List<Integer>> adj,int[] color){
        Queue<Integer> q = new LinkedList<>();
        q.offer(src);
        color[src] = 0;
        while(!q.isEmpty()){
            int node = q.poll();

            for(int num: adj.get(node)){
                if(color[num] == -1){
                    color[num] = 1 - color[node];
                    q.offer(num);
                }

                else if(color[num]==color[node]){
                    return false;
                }
            }
        }

        return true;
    }


    public boolean possibleBipartition(int n, int[][] dislikes) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n+1;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge : dislikes){
            int u  = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int[] color = new int[n+1];

        Arrays.fill(color,-1);


        for(int i=1;i<n+1;i++){
            if(color[i]==-1){
                if(check(i,adj, color)==false){
                    return false;
                }
            }

        }

         return true;
    }
}