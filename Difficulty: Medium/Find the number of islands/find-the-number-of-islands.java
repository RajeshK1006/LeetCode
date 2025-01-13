//{ Driver Code Starts
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt(); // Number of test cases
        while (tc-- > 0) {
            int n = scanner.nextInt(); // Number of rows
            int m = scanner.nextInt(); // Number of columns
            char[][] grid = new char[n][m];

            // Read the grid input
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    grid[i][j] = scanner.next().charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
            System.out.println("~");
        }
        scanner.close();
    }
}

// } Driver Code Ends


class Solution {
    public int numIslands(char[][] grid) {
        // Code here
        int lands = 0;
        int r = grid.length;
        int c = grid[0].length;
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]=='1'){
                    DFS(grid, i,j,r,c);
                    lands +=1;
                }
            }
        }
        
        return lands;
        
    }
    
    void DFS(char[][] grid, int i, int j, int r, int c){
        if(i<0||i>=r||j<0||j>=c||grid[i][j]=='0'){
            return;
        }
        
        grid[i][j] = '0';
        
        DFS(grid, i+1,j,r,c);
        DFS(grid, i+1,j+1,r,c);
        DFS(grid, i+1,j-1,r,c); 
        DFS(grid, i-1,j,r,c);
        DFS(grid, i-1,j+1,r,c);
        DFS(grid, i-1,j-1,r,c);
        DFS(grid, i,j+1,r,c);
        DFS(grid, i,j-1,r,c);
    }
}