class Solution {
    int maxSubarraySum(int[] arr) {
        // Your code here
        // Map<Integer,Integer> map = new HashMap<>();
        int sum = 0; 
        int maxi = Integer.MIN_VALUE;
        for(int num : arr){
            sum += num;
            
            maxi = Math.max(maxi,sum);
            // map.put(sum,i);
            if(sum<0) sum = 0;
        }
        
        return maxi;
    }
}
