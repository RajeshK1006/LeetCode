class Solution {
    public int specialArray(int[] nums) {
        int l = 0;
        int r = nums.length;
        while(l<=r){
            int mid = l+ (r-l)/2;
            int cnt = helper(nums,mid,0);
            if (cnt==mid){
                return mid;
            }

            else if (cnt < mid){
                r = mid -1;
            }
            else{
                l = mid + 1;
            }

        }

        return -1;
    }

    int helper(int[] nums, int x , int cnt){
        for(int num: nums){
            if (num>=x){
                cnt++;
            }
        }

        return cnt;
    }
}