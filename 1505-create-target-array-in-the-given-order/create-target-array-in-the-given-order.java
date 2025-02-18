class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> arr= new ArrayList<>();
       
        for(int i=0;i<nums.length;i++){
            arr.add(index[i],nums[i]);
             
        }
        System.out.println(arr.toString());

        int[] res = new int[nums.length];
        int pos = 0;
        for(int ele : arr){
            res[pos] = ele;
            pos++;
        } 
        return res;
    }
}