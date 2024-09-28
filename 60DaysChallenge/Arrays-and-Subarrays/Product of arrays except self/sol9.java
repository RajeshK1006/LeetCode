class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int[] pre = new int[n];
        int[] suf = new int[n];

        Arrays.fill(pre,1);
        Arrays.fill(suf,1);
        int p=1;
        int s = 1;

        for(int i=1;i<n;i++){
            p *= nums[i-1];
            pre[i] = p;

            s *= nums[n-i];

            suf[n-1-i] = s;

        }


        for(int i=0;i<n;i++){
            nums[i] = pre[i]*suf[i];
        }


        return nums;
         
    }
}
