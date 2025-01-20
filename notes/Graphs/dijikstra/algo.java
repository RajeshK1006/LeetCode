import java.util.*;

class pair{
    int node;
    int dis'
    
    public pair(int node, int dis){
        this.node = node;
        this,dis = dis;
    }
}

public class Main{
    int[] dijisktras(int v, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S){
        
        
        PriorityQueue<pair> pd = new PriorityQueue<pair>((x,y) -> x.distance,y.distance)
        
        // where x is the distance 
        // y is the node 
        
        int[] dis = new int[v];
        
        for(int i = 0; i<v;i++){
            dis[i] = int(1e9);
            
            
        }
        
        dis[S] = 0;
        
        pq.add(new pair(0,S));
        
        while (!pq.isEmpty()){
            pair curr = pq.poll();
            int distance = curr.dis;
            int node = curr.node;
            
            for(int i=0;i<adj.get(node).size();i++){
                int wieght = adj.get(node).get(i).get(1);
                
                int adjnode = adj.get(node).get(i).get(0);
                
                if(distance + wieght < dis[adjnode]){
                    dis[adjnode] = dis + wieght;
                    pq.add(new pair(dis[adjnode],adjnode));
                }
            }
        }
        
        return dis;
    }
}
