class Solution {
    public int majorityElement(int[] nums) {
        int cnt = 0;
        Integer ele = null;
        for(int num: nums){
            if(cnt==0){
                ele = num;
                cnt =  1;
            }          
            else if(ele == num){
                cnt++;
            }  
            else{
                cnt--;
            }
        }

        int cnt2 = 0;
        for(int num:nums){
            if(ele==num){
                cnt2++;
            }
        }

        if(cnt2 >= nums.length/2){
            return ele;
        }

        return -1;

 


    }
}