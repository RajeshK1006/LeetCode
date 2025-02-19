class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        pre[0] = 1;
        for(int i=1;i<nums.length;i++){
            pre[i] = pre[i-1] * nums[i-1];
        }
        System.out.println(Arrays.toString(pre));
        int[] sff = new int[nums.length];
        sff[nums.length-1] = 1;
        for(int i = nums.length-2;i>=0;i--){

            sff[i] = sff[i+1] * nums[i+1];
        }
        System.out.println(Arrays.toString(sff));

        for(int i=0;i<nums.length;i++){

            nums[i] = pre[i] * sff[i];
        }
        return nums;
     }
}