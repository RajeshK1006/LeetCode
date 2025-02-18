class Solution {
    public int[][] generateMatrix(int n) {
        int ele =1 ;

        int[][] mat = new int[n][n];
        int l = 0;
        int t = 0;
        int r = n -1;
        int b = n -1;

        while(l<=r && t<= b){
            for(int i=l;i<=r;i++){
                mat[t][i] = ele ;
                ele +=1;
            }
            t+=1;
            for(int i=t;i<=b;i++){
                mat[i][r] = ele ;
                ele +=1;
            }
            r-=1;

            if(t<=b){
                for(int i=r;i>=l;i--){
                    mat[b][i] = ele ;
                    ele +=1;
                }
            }

            b-=1;

            if(l<=r){
                for(int i=b;i>=t;i--){
                    mat[i][l] = ele ;
                    ele +=1;
                }

                
            }
            l+=1;
        }
        return mat;
    }
}