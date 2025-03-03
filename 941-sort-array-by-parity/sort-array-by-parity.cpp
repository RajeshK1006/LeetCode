class Solution {
public:
    vector<int> sortArrayByParity(vector<int>& nums) {
        int l =0; 
        int r = nums.size() -1;
        while(l<=r){
            if (nums[r]%2==0){
                int temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;
                l++;
            }
            else if(nums[l]%2!=0){
                int temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;
                r--;
            }
            else{
l++;
            r--;
            }
            
        }

        return nums;
    }
};