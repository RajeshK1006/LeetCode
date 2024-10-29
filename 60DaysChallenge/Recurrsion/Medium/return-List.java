import java.util.*;

class kk{
    public static void main(String args[]){
        int[] arr = new int[] {1,4,3,6,7,2,9,8,2,9,9,9,9};
        
        int target = 9;
        int l = 0;
        int n = arr.length ;
        List<Integer> lst = new ArrayList<>();
        System.out.println(helper(arr,l,n,target,lst));
    }
    
    static List<Integer> helper(int[] arr,int l, int n, int target,List<Integer> lst){
        if (l>=n){
            return lst;
        }
        
        if (arr[l] == target){
            lst.add(l);
            return helper(arr,l+1,n,target,lst);
        }
        else{
            return helper(arr, l+1,n,target,lst);
        }
    }
}
