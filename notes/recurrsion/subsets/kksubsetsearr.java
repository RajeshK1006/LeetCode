import java.util.*;
class kk{
    public static void main(String[] args){
        int[] arr = new int[] {1,2,3};
        List <List<Integer>> res = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        int index = 0;
        int n = arr.length;
        
        helper(arr,index, n, res,current);
        
        System.out.println(res.toString());
    }
    
    static void helper(int[] arr, int index, int n,List<List<Integer>> res,List<Integer> current){
        if(index ==n){
            res.add(new ArrayList(current));
            return;
        }
        
        current.add(arr[index]);
        helper(arr,index+1,n,res,current);
        current.remove(current.size()-1);
        helper(arr,index+1,n,res,current);
    }
}
