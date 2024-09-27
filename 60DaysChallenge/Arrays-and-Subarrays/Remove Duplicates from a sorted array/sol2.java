class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet <Integer> set = new HashSet();
        set.add(nums[0]);
        int l = 1;
        int c= 1;

        for (int r =1;r<nums.length;r++){
            if(!set.contains(nums[r])){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                set.add(nums[l]);
                l+=1;
                c+=1;
            }
            
            
        }

        return c;
        
    }
}
