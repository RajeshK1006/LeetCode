class Solution {
    public int minimumOperations(int[] nums) {
        boolean[] bool = new boolean[128];
        for(int i=nums.length -1;i>=0;i--){
            if(bool[nums[i]]){
                return i/3 +1;
            }

            bool[nums[i]] = true;
        }

        return 0;
    }
}