class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] first = new int[] {-1};
        int[] last = new int[] {-1};
        helper(nums, target, first);
        helper1(nums,target,last);

        if (first[0] == -1 && last[0] == -1){
            return new int[] {-1,-1};
        }


        return new int [] {first[0],last[0]};
    }

    void helper(int[] nums, int t, int[] f){
        int l = 0;
        int r = nums.length -1;

        while (l<=r){

            int mid = l + (r-l)/2;
            if (nums[mid]==t){
                f[0] = mid;
                System.out.println(f[0]);
                r = mid -1;
            }

            else if (nums[mid] > t){
                r =mid - 1;
            }
            else{
                l = mid +1;
            }

        }
    }
    void helper1(int[] nums, int t, int[] f){
        int l = 0;
        int r = nums.length -1;

        while (l<=r){

            int mid = l + (r-l)/2;
            if (nums[mid]==t){
                f[0] = mid;
                l = mid +1;
            }

            else if (nums[mid] > t){
                r = mid - 1;
            }
            else{
                l = mid +1;
            }

        }

        
    }
}