class Solution {
    public int minimumMoves(String s) {
        int i=0;
        int moves = 0;
        while(i<s.length()){
            if(s.charAt(i)=='X'){
                i+=3;
                moves++;
            }
            else{
                i++;
            }
            // i++;
        }
        return moves;
    }
}