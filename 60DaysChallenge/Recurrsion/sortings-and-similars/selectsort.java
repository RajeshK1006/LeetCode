import java.util.*;
class kk{
    public static void main(String args[]){
        int[] arr= new int[] {1,2,3,4,5};
        int n = arr.length;
        int l = 0;
        int r = arr.length -1;
        int large = Integer.MIN_VALUE;
        Integer index = -1;
        
        System.out.println(Arrays.toString(selectsort(arr,l,r,large,index)));
    }
    
    static int[] selectsort(int[] arr, int l, int r,int large,int index){
        if (r==0){
            return arr;
        }
        
        if (l<=r){
            if (arr[l]>large){
                large = arr[l];
                index = l;
               
            }
            return selectsort(arr,l+1,r,large,index);
        }
            
        int temp = arr[r];
        arr[r] = large;
        arr[index] = temp;
        large = Integer.MIN_VALUE;
        index = -1;
        return selectsort(arr,0,r-1,large,index);
        
        
        
    }
}
