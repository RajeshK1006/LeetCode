class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] lens = new int[nums.length+1];
        Arrays.fill(lens,1);

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if (nums[i]>nums[j]){
                    lens[i] = Math.max(lens[i],1+lens[j]);
                }
            }
        }

        int maxi = 1;
        for(int i=0;i<lens.length;i++){
            maxi = Math.max(maxi,lens[i]);
        }

        return maxi;
    }
}