class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int cnt=  0;
        Integer ele = null;
        for(int num:nums){
            if (cnt==0){
                ele = num;
                cnt = 1;
            }
            else if (ele == num){
                return true;
            }
            else{
                cnt = 1;
                ele = num;
            }
        }
        return false;
    }
}