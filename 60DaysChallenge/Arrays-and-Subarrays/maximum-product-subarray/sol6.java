class Solution {
    public int maxProduct(int[] nums) {
        int suff =  1;
        int pre = 1;
        int maxi = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0;i<n;i++){
            pre = pre *nums[i];
            suff = suff* nums[n-i-1];

            int temp = Math.max(pre,suff);

            maxi = Math.max(temp,maxi);

            if (pre==0){
                pre = 1;
            }

            if (suff==0){
                suff = 1;
            }
        }
        

        return maxi;
    }
}