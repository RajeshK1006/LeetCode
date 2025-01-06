class Solution {
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<isConnected.length;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[0].length;j++){
                if (isConnected[i][j]==1){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }

        int pro = 0;
        int[] visit = new int[isConnected.length];

        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[0].length;j++){
                if (isConnected[i][j]==1 && visit[i]==0){
                    DFS(i,adj,visit);
                    pro++;   
                }
            }
        }

        return pro;


    }

    void DFS(int node, List<List<Integer>> g, int[] visit){
        visit[node] = 1;
        for(int num : g.get(node)){
            if(visit[num]==0){
                DFS(num,g,visit);
            }
        }
    }
}