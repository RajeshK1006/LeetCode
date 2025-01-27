//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n][m];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }
            int[] source = new int[2];
            for (int i = 0; i < 2; i++) {
                int x = sc.nextInt();
                source[i] = x;
            }
            int[] dest = new int[2];
            for (int i = 0; i < 2; i++) {
                int x = sc.nextInt();
                dest[i] = x;
            }
            Solution ob = new Solution();
            int ans = ob.shortestPath(grid, source, dest);
            System.out.println(ans);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    int shortestPath(int[][] grid, int[] source, int[] destination) {

        // Your code here
        int N = grid.length;
        int M = grid[0].length;
        int src_R = source[0];
        int src_C = source[1];
        int des_R = destination[0];
        int des_C = destination[1];
        
        if(grid[src_R][src_C] ==0 || grid[des_R][des_C] == 0){
            return -1;
        }
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((x,y)-> x[0] - y[0]);
        pq.offer(new int[] {src_R,src_C,0});
        int[][] visit = new int[N][M];
        visit[src_R][src_C] = 1;
        
        int[][] dir = new int[][] {{0,1},{0,-1},{1,0},{-1,0}};
        
        while (!pq.isEmpty()){
            int[] curr = pq.poll();
            int dis = curr[0];
            int rr = curr[1];
            int cc = curr[2];
            
            if(rr == des_R & cc == des_C){
                return dis;
            }
            
        
            
            for(int i=0;i<4;i++){
                int nx = rr + dir[i][0];
                int ny = cc + dir[i][1];
                
                if(nx<0 || nx>=N|| ny<0 || ny>=M || grid[nx][ny] != 1 ||visit[nx][ny] != 0 ) continue;
                visit[nx][ny] = 1;
                int newdistance = dis + 1;
            
                pq.offer(new int[] {newdistance ,nx,ny});
                
            }
        }
        
        return -1;
    }
}
