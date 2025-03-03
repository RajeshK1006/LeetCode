class Solution {
public:
    vector<int> sortArrayByParityII(vector<int>& nums) {
        int l = 0;
        int r = 1;

        while(r<nums.size() && l < nums.size()){
            if(nums[l]%2!=0 || nums[r]%2==0){
                swap(nums[l],nums[r]);
            
            }

            if(nums[l]%2==0){
                l+=2;
            }
            if(nums[r]%2!=0){
                r+=2;
            }
        }

        return nums;
    }
};