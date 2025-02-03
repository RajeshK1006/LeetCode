class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxi = 1;
        int inc = 1;
        int des = 1;

        for(int i=1;i<nums.length;i++){
            if (nums[i-1]<nums[i]){
                inc +=1;
                des = 1;
                
    
            }

            else if(nums[i-1]> nums[i]){
                des +=1;
                inc =1;
            }

            else{
                des = 1;
                inc = 1;
            }



            maxi = Math.max(maxi,Math.max(inc, des));
        }

        return maxi;
    }
}