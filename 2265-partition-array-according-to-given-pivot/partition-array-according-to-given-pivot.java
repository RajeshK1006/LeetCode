class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> arr = new ArrayList<>();
        for(int num : nums){
            if (num < pivot){
                arr.add(num);
            }
        }

        for(int num : nums){
            if (num == pivot){
                arr.add(num);
            }
        }

        for(int num : nums){
            if (num > pivot){
                arr.add(num);
            }
        }

        for(int i=0;i<arr.size();i++){
            nums[i] = arr.get(i);
        }

        return nums;

    }
}