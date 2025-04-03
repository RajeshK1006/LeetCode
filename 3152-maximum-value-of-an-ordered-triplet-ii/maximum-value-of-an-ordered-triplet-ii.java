class Solution {
    public long maximumTripletValue(int[] nums) {
        int[] pre = new int[nums.length];
        int[] suf = new int[nums.length];
        int maxi = nums[0];
        int suf_max = nums[nums.length-1];

        pre[0] = maxi;
        suf[nums.length-1] = suf_max;
        int index =1;
        int sindex = nums.length-2;
        for(int i=1;i<nums.length;i++){
            maxi = Math.max(maxi,nums[i]);
            pre[index++] = maxi;

            suf_max = Math.max(nums[nums.length -i - 1],suf_max);
            suf[sindex--] = suf_max;
        }

        System.out.println(Arrays.toString(pre));
        System.out.println(Arrays.toString(suf));
        

        long glb = 0;

        for(int i=1;i<nums.length-1;i++){
            long val = (pre[i-1] - nums[i]);
            long v = val * suf[i+1];
            glb = Math.max(glb,v);
        }

        return glb;
    }
}