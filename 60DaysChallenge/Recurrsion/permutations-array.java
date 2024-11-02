import java.util.*;

class kk{
    public static void main(String[] args){
        String[] nums = new String[] {"a","b","c"};
        List<List<String>> outer = new ArrayList<>();
        List<String> inner = new ArrayList<>();
        Set<String> s = new HashSet<>();
        
     
        
        helper(nums,inner, outer, s);
        
        System.out.println(outer.toString());
    }
    
    static void helper(String[] nums, List<String> inner, List<List<String>> outer, Set<String> s){
        if(s.size()==nums.length){
            outer.add(new ArrayList<>(inner));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(!s.contains(nums[i])){
                inner.add(nums[i]);
                s.add(nums[i]);
                helper(nums,inner, outer,s);
                inner.remove(inner.size()-1);
                s.remove(nums[i]);
            }
        }
    }
}
