class Solution {
    public int[][] transpose(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        int[][] res = new int[c][r];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                res[j][i] = mat[i][j];

            }
        }
        
        return res;
    }
}