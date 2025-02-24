class Solution {
    public int arrangeCoins(int n) {
        int cnt = 0;
        int l =1;
        while (n>=l){
            n-= l;
            l++;
            cnt +=1;
        }

        return cnt;
    }
}