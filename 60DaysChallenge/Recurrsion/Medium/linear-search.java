class kk{
    public static void main(String args[]){
        int[] arr = new int[] {1,4,3,6,7,2,9,8,2};
        
        int target = 9;
        int l = 0;
        int n = arr.length ;
        
        System.out.println(helper(arr,l,n,target));
    }
    
    static Boolean helper(int[] arr,int l, int n, int target){
        if (l>=n){
            return false;
        }
        
        if (arr[l] == target){
            return true;
        }
        else{
            return helper(arr, l+1,n,target);
        }
    }
}
