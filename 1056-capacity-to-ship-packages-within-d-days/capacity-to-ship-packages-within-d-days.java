class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int r = 0;
        int l = weights[0];
        for(int num:weights){
            r+=num;
            l = Math.max(num, l);
        }
        
        int ans = l;
        while(l<=r){
            int mid = l+(r-l)/2;

            int day = helper(weights,mid);
            if (day<=days){
                ans = mid;
                r = mid -1;
            }
            else{
                l = mid +1;
            }
        }

        return ans;
    }

    int helper(int[] weights, int cap){
        int day = 1;
        int carry = 0;
        for(int num:weights){
            carry+=num;
            if(carry<=cap){
                continue;
            }
            else{
                day+=1;
                carry = num;
            }
        }

        return day;

    }
}