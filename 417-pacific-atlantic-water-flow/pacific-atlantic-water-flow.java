class Solution {
     int[][] dir = new int[][] {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int r = heights.length;
        int c = heights[0].length;

        int[][] p = new int[r][c];
        int[][] a = new int[r][c];

        for (int i = 0; i < r; i++) {
            DFS(heights, i, 0, r, c, p); // Left edge for Pacific
            DFS(heights, i, c - 1, r, c, a); // Right edge for Atlantic
        }
        for (int j = 0; j < c; j++) {
            DFS(heights, 0, j, r, c, p); // Top edge for Pacific
            DFS(heights, r - 1, j, r, c, a); // Bottom edge for Atlantic
        }

        List<List<Integer>> outer = new ArrayList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(p[i][j]==1 && a[i][j]==1){
                    outer.add(Arrays.asList(i,j));
                }
            }
        }
        return outer;
    }

    void DFS(int[][] g, int i, int j, int r, int c, int[][] visit){
        if(i<0|| i>=r|| j<0|| j>=c|| visit[i][j]==1){
            return;
        }

        visit[i][j] = 1;
        for(int ii=0;ii<4;ii++){
            int x = i + dir[ii][0];
            int y = j + dir[ii][1];

           if (x >= 0 && x < r && y >= 0 && y < c && g[x][y] >= g[i][j]) {
                DFS(g, x, y, r, c, visit);
            }
        }
    }
}