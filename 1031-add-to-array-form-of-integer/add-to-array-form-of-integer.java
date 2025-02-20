class Solution {
    public List<Integer> addToArrayForm(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        int i = nums.length -1;

        while(i>=0 || k > 0){
            if(i>=0){
                k += nums[i];
            }

            res.add(k%10);
            k = k/10;
            i-=1;
        }

        Collections.reverse(res);
        return res;
    }
}