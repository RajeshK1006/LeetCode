import java.util.*;
class kk{
    public static void main(String args[]){
        int[] arr= new int[] {5,6,2,0};
        int n = arr.length;
        int l = 0;
        int r = arr.length -1;
        
        System.out.println(Arrays.toString(bubblesort(arr,l,r)));
    }
    
    static int[] bubblesort(int[] arr, int l, int r){
        if (r==0){
            return arr;
        }
        
        if (l<r){
            if (arr[l]>arr[l+1]){
                int temp = arr[l];
                arr[l] = arr[l+1];
                arr[l+1] = temp;
                return bubblesort(arr,l+1,r);
            }
            else{
                return bubblesort(arr,l+1,r);
            }
        }
        
        return bubblesort(arr,0,r-1);
    }
}
