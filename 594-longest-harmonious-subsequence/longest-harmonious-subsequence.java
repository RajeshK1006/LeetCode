class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int l =0;
        int maxi = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] - nums[l] <= 1){
                int length = i-l+1;
                if(nums[i]!=nums[l]){
                    maxi = Math.max(maxi,length);
                }
                
            }
            while(nums[i] - nums[l]>1){
                l++;
            }
        }

        return maxi;
    }
}