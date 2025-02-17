class Solution {
    public void nextPermutation(int[] nums) {
        int idx = -1;
        int idx1 = -1;
        
        // find the break point 
        for(int i=nums.length -2;i>=0;i--){
            if (nums[i]<nums[i+1]){
                idx = i;
                break;
            }
        }
        if (idx==-1){
            reverse(nums,0,nums.length-1);
        }
        else{
            for(int i=nums.length-1;i>=0;i--){
                if (nums[i] > nums[idx]){
                    idx1 = i;
                    break;
                }
            }

            swap(nums,idx,idx1);


            reverse(nums,idx+1,nums.length-1);
        }


    }
    void swap(int[] arr, int l, int r){
        int temp = arr[l];

        arr[l] = arr[r];
        arr[r] = temp;
    }
    void reverse(int[] arr,int l, int r){

        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}