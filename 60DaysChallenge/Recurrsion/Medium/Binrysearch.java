public class Main{
    public static int Binarysearch(int[] arr, int l,int r,int k){
        if (l<=r){
            int mid = (l+r)/2;
            
            if (arr[mid] == k){
                return arr[mid];
            }
            else if (arr[mid] <k){
                return Binarysearch(arr,mid+1,r,k);
            }
            else{
                return Binarysearch(arr,l,mid -1, k);
            }
        }
        
        return -1;
         
    }
    public static void main(String[] args){
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
        int k = 2;
        int l = 0;
        int r = arr.length-1;
        
        int ans = Binarysearch(arr,l,r,k);
        
        System.out.println(ans);
        
        
        
    }
}
