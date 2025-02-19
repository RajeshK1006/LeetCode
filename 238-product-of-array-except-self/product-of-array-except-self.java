class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        pre[0] = 1;
        for(int i=1;i<nums.length;i++){
            pre[i] = pre[i-1] * nums[i-1];
        }
        System.out.println(Arrays.toString(pre));
        int sff = 1;
        for(int i=nums.length-1;i>=0;i--){
            pre[i] *= sff;
            sff *= nums[i];
        }

        return pre;
        

    } 
}