public class kk{
    public static void main(String args[]){
        int[] arr = new int[] {7,8,9,10,11,12,1,2,3,4,5,6};
        
        int l = 0;
        int r = arr.length -1;
        int target =  25;
        int ans = helper(arr,l,r,target);
        System.out.println(ans);
    }
    static int helper(int[] arr, int l, int r, int target){
        if(l>r){
            return -1;
        }
        
        if (l<=r){
            int mid = (l+r)/2;
            
            if (arr[mid] == target){
                return mid;
            }
            
            if (arr[l] <= arr[mid]){
                if (arr[l]<=target && target<=arr[mid]){
                    return helper(arr,l,mid-1,target);
                }
                else{
                    return helper(arr,mid+1,r,target);
                }
            }
            else{
                if (arr[mid+1]<=target && target<=arr[r]){
                    return helper(arr,mid+1,r,target);
                }
                else{
                    return helper(arr,l,mid-1,target);
                }
                
            }
        }
        
        return 0;
        
        
    }
}
