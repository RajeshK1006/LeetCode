class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length*2];
        int pos = 0;
        for(int i=0;i<2;i++){
            for(int ele : nums){
                result[pos] = ele;
                pos++;
            }
        }
        return result;
    }
}