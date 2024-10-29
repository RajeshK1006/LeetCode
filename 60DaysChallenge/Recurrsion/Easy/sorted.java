class kk{
    public static void main(String args[]){
        int[] arr = new int[] {1,2,3,4,5,6,833,833};
        int l = 0;
        int n = arr.length;
        
        System.out.println(helper(arr,l,n));
    }
    
    static Boolean helper(int[] arr, int l , int n){
        
        if (l>=n-1){
            return true;
        }
        
    
        if (arr[l]<=arr[l+1]){
                return helper(arr,l+1,n);
            }
        else{
            return false;
            }
        
    }
}
