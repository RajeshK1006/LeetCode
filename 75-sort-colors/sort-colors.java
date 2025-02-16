class Solution {
    public void sortColors(int[] nums) {
        int l = 0;
        int mid = 0;
        int r = nums.length -1;

        while(mid <= r){
            if (nums[mid]==1){
                mid +=1;
                
            }

            else if(nums[mid]==0){
                int temp = nums[l];
                nums[l] = nums[mid];
                nums[mid] = temp;
                mid+=1;
                l+=1;
            }
            else{
                int temp = nums[r];
                nums[r] = nums[mid];
                nums[mid] = temp;
                r-=1;
            }
        }
    }
}