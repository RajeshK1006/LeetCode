// User function Template for Java

class Solution {
    public int[] common_digits(int[] nums) {
        // code here
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            while(num!=0){
                int val = num %10;
                num =  num / 10;
                set.add(val);
            }
        }
        
        // System.out.println(set);
        int m =set.size();
        int[] res  = new int[m];
        int i=0;
        for(int num: set){
            res[i++] = num;
        }
        return res;
        
    }
}