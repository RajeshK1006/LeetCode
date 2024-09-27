class Solution {
    public int maxSubArray(int[] nums) {
        int summ = 0;
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        HashMap <Integer,Integer> map = new HashMap<>();

        for(int i= 0;i<n;i++){
            summ += nums[i];

            maxi = Math.max(summ,maxi);

            if(summ<0){
                summ = 0;
            }

            
        }

        return maxi;
        
    }
}
