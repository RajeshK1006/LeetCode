class Solution {
    public int celebrity(int mat[][]) {
        // code here
        // i!=j anf i,j == 1 then the celeb will be j
        // map[j] += 1;
        // if(map[j]==mat.length -1) return j;
        if(mat.length==1 && mat[0].length==1) return 0;
       int[] know_me = new int[mat.length];
       int[] i_know = new int[mat.length];
       for(int i=0;i<mat.length;i++){
           for(int j=0;j<mat.length;j++){
               if(i==j) continue;
               if(mat[i][j]==1){
                   know_me[j]++;
                   i_know[i]++;
               }
               
           }
       }
       
       for(int i=0;i<mat.length;i++){
           if(know_me[i] == mat.length -1 && i_know[i]==0){
               return i;
           }
       }
       
       return -1;
    }
}