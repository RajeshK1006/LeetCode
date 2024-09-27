class Solution {
    public int removeElement(int[] nums, int val) {
        
        int l = 0;
        int r = nums.length-1;
        while (l<r){
            if (nums[l] != val){
                l+=1;
            }
            if (nums[r]==val){
                r-=1;
            }

            if (nums[r]!=val && nums[l]==val && l<r){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;

            }

            }
                    
        
        int c =0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]!=val){
                c++;
            }

            }
        
        return c;
    }
}
