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
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int[][] ans = obj.nearest(grid);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


class Solution
{
    //Function to find distance of nearest 1 in the grid for each cell.
    public int[][] nearest(int[][] grid)
    {
        // Code here
        Queue<int[]> q = new LinkedList<>();
        int r = grid.length;
        int c = grid[0].length;

        int[][] h = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    h[i][j]=0;
                    q.offer(new int[] {i,j});
                }
                else{
                    h[i][j] = -1;
                }
            }
        }
        int[][] dir = new int[][] {{0,1},{0,-1} ,{1,0},{-1,0}};
        
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int rr = curr[0];
            int cc = curr[1];
            
            for(int i=0;i<4;i++){
                int nx = rr + dir[i][0];
                int ny = cc + dir[i][1];
                
                if(nx<0 || nx >= r || ny <0 || ny >= c|| h[nx][ny]!= -1) continue;
                
                h[nx][ny] = 1 + h[rr][cc];
                q.offer(new int[] {nx,ny});
            }
        }
        
        return h;
        
    }
}
