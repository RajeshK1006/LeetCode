class Pair{
    double prob;
    int node;

    public Pair(double prob, int node){
        this.prob = prob;
        this.node = node;
    }
}
class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {

        List<List<Pair>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());


        }

        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];

            adj.get(u).add(new Pair(succProb[i],v));
            adj.get(v).add(new Pair(succProb[i],u));
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Double.compare(b.prob, a.prob));

        pq.offer(new Pair(1.0,start_node));
        double[] maxProb = new double[n];
        Arrays.fill(maxProb, 0.0);
        maxProb[start_node] = 1.0;

        double result = 0;
        while(!pq.isEmpty()){
            Pair curr = pq.poll();
            double curr_prob = curr.prob;
            int node = curr.node;


            

            if(node==end_node){
                return curr_prob;
            }

            for(Pair edge : adj.get(node)){
                int next_node = edge.node;
                double next_prob = edge.prob;
                double newProb = next_prob * curr_prob;

                if(newProb > maxProb[next_node]){
                    maxProb[next_node] = newProb;
                    pq.offer(new Pair(newProb, next_node));
                }

            }
        } 

        return result;
        
    }
}