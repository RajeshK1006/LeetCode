import java.util.*;

class Solution {
    public boolean hasValidPath(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        if(r==1 && c==1){
            return true;
        }

        // Map each street type to possible directions
        HashMap<Integer, int[][]> map = new HashMap<>();
        map.put(1, new int[][] {{0, -1}, {0, 1}});  // Left, Right
        map.put(2, new int[][] {{1, 0}, {-1, 0}});  // Down, Up
        map.put(3, new int[][] {{0, -1}, {1, 0}});  // Left, Down
        map.put(4, new int[][] {{0, 1}, {1, 0}});   // Right, Down
        map.put(5, new int[][] {{0, -1}, {-1, 0}}); // Left, Up
        map.put(6, new int[][] {{0, 1}, {-1, 0}});  // Right, Up

        // BFS queue
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {0, 0});
        boolean[][] visited = new boolean[r][c];
        visited[0][0] = true;

        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int x = curr[0];
            int y = curr[1];
            int streetType = grid[x][y];

            for (int[] dir : map.get(streetType)) {
                int nx = x + dir[0];
                int ny = y + dir[1];

                // Check bounds and visited status
                if (nx >= 0 && nx < r && ny >= 0 && ny < c && !visited[nx][ny]) {
                    // Check if the connection between current and next cell is valid
                    int nextStreetType = grid[nx][ny];
                    int revX = -dir[0];
                    int revY = -dir[1];

                    // Check if the next street can connect back
                    boolean isCompatible = Arrays.stream(map.get(nextStreetType))
                        .anyMatch(d -> d[0] == revX && d[1] == revY);

                    if (isCompatible) {
                        q.offer(new int[] {nx, ny});
                        visited[nx][ny] = true;

                        // Check if reached the destination
                        if (nx == r - 1 && ny == c - 1) {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }
}
