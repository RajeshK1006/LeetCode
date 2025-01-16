class Solution {
    public void solve(char[][] board) {
        int r = board.length;
        int c = board[0].length;

        for(int i=0;i<c;i++){
            if(board[0][i]=='O'){
                DFS(board,0,i,r,c);
            }
        }
        for(int i=0;i<c;i++){
            if(board[r-1][i]=='O'){
                DFS(board,r-1,i,r,c);
            }
        }
        for(int i=0;i<r;i++){
            if(board[i][0]=='O'){
                DFS(board,i,0,r,c);
            }
        }
        for(int i=0;i<r;i++){
            if(board[i][c-1]=='O'){
                DFS(board,i,c-1,r,c);
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(board[i][j]=='O'){
                    board[i][j] = 'X';
                }
                else if(board[i][j]=='A'){
                    board[i][j] = 'O';
                }
            }
        }

        
    }

    void DFS(char[][] g, int i , int j, int r, int c){
        if(i<0||i>=r||j<0||j>=c||g[i][j]!='O'){
            return ;
        }

        g[i][j] = 'A';

        DFS(g,i-1,j,r,c);
        DFS(g,i+1,j,r,c);
        DFS(g,i,j-1,r,c);
        DFS(g,i,j+1,r,c);
    }
}