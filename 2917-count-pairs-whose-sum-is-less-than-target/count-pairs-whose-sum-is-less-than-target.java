class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int l =0;
        int r = nums.size() -1;
        int cnt = 0;

        while(l<r){
            int sum = nums.get(l)+nums.get(r);
            if(sum<target){
                cnt+=(r-l);
                l++;
            }
            else{
                r--;
            }
        }

        return cnt;

    }
}