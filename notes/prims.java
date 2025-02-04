class Solution {
    static int spanningTree(int V, int E, List<List<int[]>> adj) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> x[0] - y[0]);
        int[] visit = new int[V]; // Visited array to track visited nodes

        pq.offer(new int[] {0, 0}); // Start with node 0 and weight 0
        int sum = 0;

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();

            int weight = curr[0];
            int node = curr[1];

            if (visit[node] == 1) continue; // Skip visited nodes

            visit[node] = 1; // Mark node as visited
            sum += weight;

            for (int[] neighbor : adj.get(node)) {
                int nextNode = neighbor[0];
                int edgeWeight = neighbor[1];
                if (visit[nextNode] == 0) {
                    pq.offer(new int[] {edgeWeight, nextNode});
                }
            }
        }

        return sum;
    }
}
