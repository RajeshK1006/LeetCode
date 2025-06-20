class Solution {
    int missingNum(int arr[]) {
        // code here
        int[] res = new int[arr.length+2];
        for(int num : arr){
            res[num] = 1;
        }
        
        for(int i=1;i<res.length;i++){
            if(res[i]==0) return i;
        }
        
        return arr.length;
    }
}