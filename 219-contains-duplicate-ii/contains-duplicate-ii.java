class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> s = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(s.contains(nums[i])){
                return true;
            }
            
                s.add(nums[i]);
            
            
            

            if(s.size()>k){
                s.remove(nums[i-k]);
            }
        }

        return false;
    }
}