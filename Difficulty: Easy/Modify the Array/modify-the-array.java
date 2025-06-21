// User function Template for Java

class Solution {
    static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
        // Complete the function
        for(int i = 0;i<arr.length -1;i++){
            if(arr[i]==arr[i+1]){
                arr[i] = 2 * arr[i];
                arr[i+1] = 0;
            }
        }
        
        helper(arr);
        ArrayList<Integer> a = new ArrayList<>();
        for(int num : arr){
            a.add(num);
        }
        
        return a;
    }
    
    static void helper(int[] arr){
        int l = 0; 
        for(int r =0;r<arr.length;r++){
            if(arr[r]!=0){
                if(r!=l){
                    int temp = arr[r];
                    arr[r] = arr[l];
                    arr[l] = temp;
                }
                
                l++;
            }
        }
        
        
    }
    
    
}
