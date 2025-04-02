class Solution {
    public long maximumTripletValue(int[] nums) {
        long maxi = Integer.MIN_VALUE;
        for(int i=0;i<nums.length-2;i++){
            
            for(int j=i+1;j<nums.length-1;j++){
                
                for(int k=j+1;k<nums.length;k++){
                    long val = nums[i] - nums[j];
                    long sum = val *nums[k];
                    System.out.println(sum);
                    if(sum>0){
                        maxi = Math.max(maxi,sum);
                    }
                    
                }
            }
        }

        return  maxi >0 ? maxi  : 0;

    }
}