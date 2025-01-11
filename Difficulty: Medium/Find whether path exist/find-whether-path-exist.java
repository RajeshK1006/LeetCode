//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] grid = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            boolean ans = obj.is_Possible(grid);
            if(ans)
                System.out.println("1");
            else 
                System.out.println("0");
        }
    }
}
// } Driver Code Ends



class Solution
{
    //Function to find whether a path exists from the source to destination.
    int[][] dir = new int[][] {{0,1}, {0,-1}, {1,0}, {-1,0}};
    public boolean is_Possible(int[][] grid)
    {
        // Code hereint
        int r = grid.length;
        int c = grid[0].length;
        int[] src = new int[2];
        int[] des = new int[2];
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    src[0]=i;
                    src[1]=j;
                    
                }
                else if(grid[i][j]==2){
                    des[0] = i;
                    des[1] = j;
                }
            }
        }
        
        
        
        return DFS(grid,src[0],src[1], r,c);
        
        
        
    }
    
    boolean DFS(int[][] grid, int src_r,int src_c,int r, int c){
        if(grid[src_r][src_c]==2){
            return true;
        }
        
        grid[src_r][src_c] = 0;
        for(int i=0;i<4;i++){
            int x = src_r + dir[i][0];
            int y = src_c + dir[i][1];
            
            if(x<0||x>=r||y<0||y>=c||grid[x][y]==0){
                continue;
            }
            
            
            
            
            else if(DFS(grid,x,y,r,c)){
                return true;
            }
        }
        
        return false;
        
        
    }
}