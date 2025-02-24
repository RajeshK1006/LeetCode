class Solution {
    public boolean isPerfectSquare(int num) {
        
        int  l = 1;
        int r = num;

        while(l<=r){
            int mid = l+(r-l)/2;
            if( (long) mid*mid== (long )num){
                return true;
            }
            else if((long) mid*mid > (long )num){
                r = mid -1;
            }
            else{
                l = mid + 1;
            }
        }

        return false;
    }
}