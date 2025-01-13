//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(in.readLine());
            int m = Integer.parseInt(in.readLine());
            char mat[][] = new char[n][m];
            for (int i = 0; i < n; i++) {
                String S[] = in.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    mat[i][j] = S[j].charAt(0);
                }
            }

            Solution ob = new Solution();
            char[][] ans = ob.fill(mat);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static char[][] fill(char[][] mat) {
        // code here
        int r = mat.length;
        int c  = mat[0].length;
        
        for(int i=0;i<c;i++){
            if (mat[0][i]=='O'){
                DFS(mat,0,i,r,c);
            }
        }
        for(int i=0;i<c;i++){
            if (mat[r-1][i]=='O'){
                DFS(mat,r-1,i,r,c);
            }
        }
        
        for(int i=0;i<r;i++){
            if (mat[i][0]=='O'){
                DFS(mat,i,0,r,c);
            }
        }
        for(int i=0;i<r;i++){
            if (mat[i][c-1]=='O'){
                DFS(mat,i,c-1,r,c);
            }
        }
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]=='A'){
                    mat[i][j]='O';
                }
                else if(mat[i][j]=='O'){
                    mat[i][j] = 'X';
                }
            }
        }
        
        return mat;
        
        
        
    }
    
    static void DFS(char[][] mat, int src, int j,int r, int c){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{src, j});

        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int x = cell[0];
            int y = cell[1];

            if (x < 0 || x >= r || y < 0 || y >= c || mat[x][y] != 'O') {
                continue;
            }

            mat[x][y] = 'A';

            queue.add(new int[]{x - 1, y});
            queue.add(new int[]{x + 1, y});
            queue.add(new int[]{x, y - 1});
            queue.add(new int[]{x, y + 1});
    }
    }
}