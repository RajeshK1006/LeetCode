class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int t = 0; 
        for(int num : arr){
            t+= num;
        }
        
        int left = 0; 
        for(int i=0;i<arr.length ;i++){
            t -= arr[i];
            if(left==t) return i;
            
            left += arr[i];
        }
        
        return -1;
        
    }
}
