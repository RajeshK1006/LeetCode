class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l,r ;
        l = 0;
        int mini =Integer.MAX_VALUE;
        int summ = 0;
        for (int i=0;i<nums.length;i++){
            summ+=nums[i];

            while (summ>=target){
                summ-=nums[l];
                int temp = i-l+1;

                mini = Math.min(mini,temp);

                l+=1;

            }

        }
        
        if (mini == Integer.MAX_VALUE){
            return 0;
        }
        else{
            return mini;
        }
    
        
        
    }
}
