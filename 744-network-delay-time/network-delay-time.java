class Pair{
    int node; 
    int distance;

    public Pair(int distance, int node){
        this.distance = distance;
        this.node = node;
    }
}

class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {

        List<List<Pair>> adj  = new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] num : times){
            int u = num[0];
            int v = num[1];
            int w = num[2];

            adj.get(u).add(new Pair(w,v));

        }
        
        int[] dis = new int[n+1];
        Arrays.fill(dis, (int)(1e9));

        dis[k] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>((x,y) -> x.distance - y.distance);

        pq.add(new Pair(0,k));

        while(!pq.isEmpty()){
            Pair current = pq.poll();
            int so_far = current.distance;
            int adj_node = current.node;

            for(Pair num : adj.get(adj_node)){
                int calc = num.distance + so_far;
                if(calc < dis[num.node]){
                    dis[num.node] = calc;

                    pq.add(new Pair(calc,num.node));
                }
            }
        }
        int maxi = 0;

        for(int i=1;i<dis.length;i++){
            if (dis[i] == (int)(1e9)){
                return -1;
            }
            else{
                maxi = Math.max(maxi,dis[i]);
            }
        }

        return maxi;
    } 
}