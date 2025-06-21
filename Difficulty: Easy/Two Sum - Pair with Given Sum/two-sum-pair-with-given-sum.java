class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        Arrays.sort(arr);
        int l =0;
        int r = arr.length -1;
        
        while(l<r){
            if(arr[l]+arr[r]==target) return true;
            else if(arr[l]+arr[r]<target) l++;
            else {
                r--;
            }
        }
        return false;
    }
}