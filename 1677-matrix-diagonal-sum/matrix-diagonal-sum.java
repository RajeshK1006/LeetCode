class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int r = mat.length;
        int col = 0;
        int rcol = r-1;
        for(int i=0;i<r;i++){

            if (i==col){
                sum += mat[i][col];
                col++;
            }

            if(i!=rcol){
                sum += mat[i][rcol];
                System.out.println(mat[i][rcol]);
                rcol--;
            }
            else if(i==rcol) rcol--;
        }

        return sum;
    }
}